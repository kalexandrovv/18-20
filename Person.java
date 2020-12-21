package temi18do20;

public class Person {
	private String name;
	private String address;
	private String phoneNumber;
	private String eMail;
	
	Person(String name, String address, String phoneNumber, String eMail) {
		this.name=name;
		this.address=address;
		this.setPhoneNumber(phoneNumber);
		this.eMail=eMail;
	}
	
	public String getName() {
		return name;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String toString() {
		return "Name: " + name + "\n"
				+"Address: " + address + "\n"
				+"Name: " + name + "\n"
				+"Email: " + eMail;
	}
	
}