package ex06.breakContinue;

public class MainEntry {

   public static void main(String[] args) {
	   //break, continue
	   
      for(int i = 1; i < 11; i++) {
    	  
         if( i == 7 ) break;  //구문 탈출
         System.out.println(i);
   }
	      for (int i = 0; i < 5; i++) {
		if (i == 7) continue; 
	//시작점으로 돌린다. for -> 증감식으로, while/do-while (조건식으로 이동)
		
		System.out.println(i);
		
//	}
//	    for (int i = 1; i <11; i++) {
//	if (i%2==0) {
//		continue;
//	}
		
	}
//      
//      for (int i = 1; i < 5; i++) {
//         System.out.println("나는 아이다." + i);
      
//         for (int j = 1; j < 10; j++) {
      
//            if(j == 7) break;
//            System.out.println("i : " + i);
//            System.out.println("j : " + j);
//            
//         }// j end
//         System.out.println();
//      } // i end
//   
   }
}