
public class UserManager {
	public void register(User user) {
		System.out.println(user.getId() +" registered succesfully!");
	}
	
	public void delete(User user) {
		System.out.println(user.getId() + " Your account has been deleted!");
	}
	
	public void editProfile(User user) {
		System.out.println(user.getId() + " Your profile has been updated!");
	}
}
