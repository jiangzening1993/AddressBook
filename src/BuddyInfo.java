
public class BuddyInfo {
	private String name, phone, address;
	
	public BuddyInfo(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		BuddyInfo b = new BuddyInfo("Homer", "Carleton", "1234");
		System.out.println("Hello " + b.getName());
	}

}
