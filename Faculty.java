package temi18do20;

public class Faculty extends Employee {
	private String officeHours;
	private String rank;
	
	public Faculty(String name,
			String address,
			String phoneNumber,
			String eMail,
			String office,
			double salary,
			String officeHours,
			String rank) {
		super(	name,
				address,
				phoneNumber,
				eMail,
				office,
				salary);
		this.setOfficeHours(officeHours);
		this.setRank(rank);
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + 
				"\n" + "Office hours: " + officeHours +
				"\n" + "Rank: " + rank;
	}
}