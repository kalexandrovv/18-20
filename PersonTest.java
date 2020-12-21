package temi18do20;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person(
				"Kiril Alexandrov",
				"Sofiq", 
				"359 245245224",
				"k.alexandrovv@gmail.com");
		Student student = new Student( 
				"Nikola Alexandrov",
				"Sofiq",
				"359 235324523",
				"n.alexandrovv@gmail.com",
				Student.FRESHMAN);
		Employee employee = new Employee(
				"MARTIN",
				"Sofiq",
				"359 34634735",
				"martinchooo@gmail.com",
				"McDonalds",
				750);
		Staff staff = new Staff(
				"Aleksandyr Grigorov",
				"Sofiq",
				"359 734562842",
				"a.grrigorovf@gmail.com",
				"KFC",
				969,
				"Glaven Gotvach");
		Faculty faculty = new Faculty(
				"Qwor",
				"Varna",
				"0879658423",
				"qwkataBee@gmail.com",
				"Bylgarska Armiq",
				1400,
				"8:00 - 16:00",
				"General");

		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(staff.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
	}
}