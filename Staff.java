package temi18do20;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name,
			String address,
			String phoneNumber,
			String eMail,
			String office,
			double salary,
			String title) {
		super(	name,
				address,
				phoneNumber,
				eMail,
				office,
				salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + 
				"\n" + "Title: " + title;
	}
}