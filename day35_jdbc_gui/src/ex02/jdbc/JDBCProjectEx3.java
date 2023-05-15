package ex02.jdbc;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dbConn.util.ConnectionHelper;

public class JDBCProjectEx3 extends JFrame implements ActionListener{
	
	//event 구현 방법 2가지
	// 1) ~Listener : interface
	// 2) ~Adapter : class
	// JFrame을 먼저 상속받았기 때문에 interface(Listener) 사용한다.
	
	//component 객체 선언
	JPanel panWest, panSouth;  //왼쪽텍스트필드, 아래쪽 버튼
	JPanel p1,p2,p3,p4,p5; 
	JTextField txtNo, txtName, txtEmail, txtPhone;
	JButton  btnTotal, btnAdd, btnDel, btnSearch, btnCancel, btnUpdate;
	
	JTable table; //검색과 전체 보기를 위한 테이블 객체 생성
	//상태변화를 위한 변수 선언
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	private static final int UPDATE = 5;
	int cmd = NONE;  //cmd = 0;
	
	MyModel model; //user class
	
	public JDBCProjectEx3(){  //생성자 함수 (멤버 변수의 초기화 담당)
		//component 등록
		panWest = new JPanel(new GridLayout(5, 0));
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //(flowlayout(flowlayout) 방향성 가짐)
		p1.add(new JLabel("번    호"));
		p1.add(txtNo = new JTextField(12));  //default 크기: 12개의 글자
		panWest.add(p1); //west 방향에 붙임
		
		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("이    름"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);
		
		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("이  메  일"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);
		
		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT)); //레이아웃 디폴트 FLOWLAYOUT
		p4.add(new JLabel("전화번호"));
		p4.add(txtPhone = new JTextField(12));
		panWest.add(p4);
		
		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel("")); //공백 한줄 추가
		panWest.add(p5);
		
		add(panWest, "West");
		
		//button 화면 아래 등록
		panSouth = new JPanel();
		panSouth.add(btnTotal= new JButton("전체보기")); 
		panSouth.add(btnAdd= new JButton("추     가"));
		panSouth.add(btnDel= new JButton("삭     제"));
		panSouth.add(btnUpdate= new JButton("수     정"));
		panSouth.add(btnSearch= new JButton("검     색"));
		panSouth.add(btnCancel= new JButton("취     소"));
		add(panSouth, "South");
		
		//event 처리
		btnTotal.addActionListener(this);   // this = btnTotal
		btnAdd.addActionListener(this);		// this = btnAdd
		btnDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		//테이블 객체 생성
		add(new JScrollPane(table = new JTable()), "Center");
		//close 창 닫기
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//메인 창 출력
		setBounds(100, 100, 700, 300); //setSize(W,H);   pack(); 
		//(x, y, w, h) bounds는 모서리가 부드러운 형태로 출력
		setVisible(true);	
		// 화면에 출력 (true)
		
		dbConnect(); 	total(); 
		//dbConnect 호출
	} //constuctor end
	
	
	//// db setting  //////////////////////////////////////////
	
	Connection conn;
	Statement stmt;
	PreparedStatement pstmtInsert, pstmtDelete, pstmtUpdate;
	PreparedStatement pstmtTotal, pstmtTotalScroll;  	//출력 시 스크롤로 화면 조정 가능
	PreparedStatement pstmtSearch, pstmtSearchScroll;	// .. 
	
	private String sqlInsert = "INSERT INTO CUSTOMERS VALUES(?, ?, ?, ?)";
	private String sqlDelete = "DELETE FROM CUSTOMERS WHERE CODE = ?";
	private String sqlUpdate = "UPDATE CUSTOMERS SET NAME = ?, EMAIL = ?, PHONE = ? WHERE CODE = ?";
	private String sqlSelect = "SELECT * FROM CUSTOMERS";
	private String sqlSearch = "SELECT * FROM CUSTOMERS WHERE NAME = ?";
			
	public void dbConnect() { //dbConnect 생성자 함수
		try {
			conn = ConnectionHelper.getConnection("oracle");
			
			pstmtInsert = conn.prepareStatement(sqlInsert);
			pstmtDelete = conn.prepareStatement(sqlDelete);
			pstmtTotal = conn.prepareStatement(sqlSelect);
			pstmtSearch = conn.prepareStatement(sqlSearch);
			pstmtUpdate = conn.prepareStatement(sqlUpdate);
			
			pstmtTotalScroll = conn.prepareStatement(sqlSelect,
						ResultSet.TYPE_SCROLL_SENSITIVE,  //커서 이동을 자유롭게 하고 업데이트 내용을 반영한다.
						ResultSet.CONCUR_UPDATABLE  //result object의 변경이 가능 <-> cursor.readonly
					);
			pstmtSearchScroll = conn.prepareStatement(sqlSelect,
						ResultSet.TYPE_SCROLL_SENSITIVE, 
						ResultSet.CONCUR_UPDATABLE );
			
		System.out.println("connection success!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	///////////////////////////////////////////////////////////
	

	@Override
	public void actionPerformed(ActionEvent e) {  //버튼 이벤트 처리
		Object obj = e.getSource();
		if( obj == btnAdd ){
			if( cmd != ADD ){
				setText(ADD);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			add();  //추가
			
		}else if( obj == btnDel ){
			if( cmd != DELETE ){
				setText(DELETE);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			try {
				del();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}  //삭제
			
			
		}else if( obj == btnSearch ){
			if( cmd != SEARCH ){
				setText(SEARCH);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			//search();  검색

		}else if (obj == btnUpdate) {
			if( cmd != UPDATE ){
				setText(UPDATE);  //user method
				return;
			} //if in
			setTitle(e.getActionCommand());
			update();  //수정
			
			
		}else if( obj == btnTotal ){
			setTitle(e.getActionCommand());
			total();   //전체보기
		}
		setText(NONE);
		init(); //초기화 메소드, user method
	
	}// actionPerformed end

	
	//delete 
	public void del() throws SQLException{
		total();
		String strNo = null;
		
		try {
			strNo = txtNo.getText();
			
			if(strNo.length() < 1) {
				JOptionPane.showMessageDialog(null, "고객 번호는 필수 입력란입니다.");
				return;
			}
			pstmtDelete.setInt(1, Integer.parseInt(strNo));
			pstmtDelete.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
//		JOptionPane.showMessageDialog(null, "삭제 성공");
//		JOptionPane.showConfirmDialog(null, "deleteSuccess");
		switch (JOptionPane.showConfirmDialog(null, "고객번호(" +strNo+") 번"," 삭제하시겠씁니까? ",
				JOptionPane.YES_NO_OPTION ) ) {
				
				case 0 :  //확인
					pstmtDelete.executeUpdate();
					conn.commit();
					break;

				case 1 :  // 아니오
					conn.rollback();
					return;
				} // switch end		
		
		total();
	} //end del()

	//Update
	public void update() {
		try {
			total();
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strMail = txtEmail.getText();
			String strPhone = txtPhone.getText();
			System.out.println(strNo+", "+strName+", "+ strMail+", "+strPhone);
			
			if (strNo.length() < 1 || strName.length() < 1) {
				JOptionPane.showMessageDialog(null, "번호와 이름은 필수 사항입니다.");
				return;
				
			}// if end
			
			switch (JOptionPane.showConfirmDialog(null,
					"("+strNo+", "+strName+", "+ strMail+", "+strPhone+")" ,
					"추가하시겠습니까? ",
					 JOptionPane.YES_NO_OPTION ) ) {
					case 0 :  //확인
						break;
		
					case 1 :  // 아니오
						return;
				} // switch end		
			
			pstmtUpdate.setString(1, strName);
			pstmtUpdate.setString(2, strMail);
			pstmtUpdate.setString(3, strPhone);
			pstmtUpdate.setInt(4, Integer.parseInt(strNo));
			pstmtUpdate.executeUpdate();  // 
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "수정이 완료되었습니다.");
			
			total();
			init();
			
		}
	}// update()
	
	
	// button event - 추가, 삭제, 검색, 전체보기 //////////////////////////
	
	public void total() { //전체보기(select all)
		try {
			ResultSet rs = pstmtTotal.executeQuery();
			ResultSet rsScroll = pstmtTotalScroll.executeQuery();
			
			if(model == null) model = new MyModel();
			
			model.getRowCount(rsScroll);
			model.setData(rs);
		
			//table.setModel(model);
			table.setModel(new DefaultTableModel(model.data, model.columnName));
			table.updateUI();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// total end
	
	
	
	
	public void add() {
		try {
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strMail = txtEmail.getText();
			String strPhone = txtPhone.getText();
//			System.out.println(strNo+", "+strName+", "+ strMail+", "+strPhone); //첫번째는 부모 컴포넌트
			
//			if( strNo.length() < 1 || strName.length() < 1 ) {
//				JOptionPane.showMessageDialog(null, "번호와 이름은 필수 사항 입니다. 입력해주세요.");
//				return;
//			} //if end
			
			switch (	JOptionPane.showConfirmDialog( null, 
											"("+strNo+", "+strName+", "+ strMail+", "+strPhone+")" ,
											"추가하시겠습니까? ",
											 JOptionPane.YES_NO_OPTION ) ) {
											//alert: 알림창, confirm: 에,아니오 창
				case 0 :  //확인
					break;
	
				case 1 :  // 아니오
					return;
			} // switch end		
			
			pstmtInsert.setInt(1, Integer.parseInt(strNo));
			pstmtInsert.setString(2, strName);
			pstmtInsert.setString(3, strMail);
			pstmtInsert.setString(4, strPhone);
			pstmtInsert.executeUpdate();  // 
			
		} catch (Exception e) {		e.printStackTrace();		}		
		JOptionPane.showMessageDialog(null, "추가 되었습니다. ");  //부모는 항상 널값
		
		init();  //추가 후 초기화 (버튼 활성화)
	} // add() end 
	
	private void init() {  //초기화 메소드
		txtNo.setText("");			txtNo.setEditable(false);
		txtName.setText("");		txtName.setEditable(false);
		txtEmail.setText("");		txtEmail.setEditable(false);
		txtPhone.setText("");		txtPhone.setEditable(false);
	}// init() end

	private void setText(int command) {   // user method
		switch(command){
			case ADD :
				txtNo.setEditable(true);
				txtName.setEditable(true);
				txtEmail.setEditable(true);
				txtPhone.setEditable(true);
				break;
			case DELETE :
				txtNo.setEditable(true);
			case SEARCH :
				txtName.setEditable(true);
				break;
		}//switch end
		
		setButton(command);  //user method
	}// setText() end

	private void setButton(int command) {  // user method
		//cancel button 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		btnUpdate.setEnabled(false);
		
		switch(command){
			case ADD :
				btnAdd.setEnabled(true);
				cmd = ADD;
				break;
			case DELETE :
				btnDel.setEnabled(true);
				cmd = DELETE;
				break;
				
			case SEARCH :
				btnSearch.setEnabled(true);
				cmd = SEARCH;
				break;
			case TOTAL :
				btnTotal.setEnabled(true);
				cmd = TOTAL;
				break;
			case UPDATE :
				btnUpdate.setEnabled(true);
				cmd = UPDATE;
				break;
			case NONE :
				btnTotal.setEnabled(true);
				btnAdd.setEnabled(true);
				btnDel.setEnabled(true);
				btnSearch.setEnabled(true);
				btnUpdate.setEnabled(true);
				btnCancel.setEnabled(true);  //
				cmd = NONE;
				break;
		}//switch end	
	}//setButton end

	public static void main(String[] args) {
		new JDBCProjectEx3();
	}
}
