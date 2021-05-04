
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(01);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setEmail("engindemirog@.......");
		instructor1.setDateOfRegistration("01.01.2019");
		
		Student student1 = new Student();
		student1.setId(8);
		student1.setFirstName("Melike");
		student1.setLastName("Kýzýlcýk");
		student1.setEmail("melikekizikcik@....");
		student1.setDateOfRegistration("29.07.2020");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.editProfile(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.enroll(student1);
	}

}
