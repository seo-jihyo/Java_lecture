package quiz;

public class Customer {
	private String name;
	private String address;
	private String tel;
	public String getName() {
		return name;
	}
	
	public Customer(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}

	
}
