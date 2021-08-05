/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism
 *
 * Student Name: Haziq Aqil
 * Student ID: 20024466
 * Date/Time created 2021-Aug-05 11:35:36 AM 
 * @author 20024466
 * 
 */

public class CCA_Coordinator {
	private String name;
	String username;
	private String password;
	private int adminID;
	String role;

	public CCA_Coordinator(String name, String username, String password, int adminID, String role) {
	this.name = name;
	this.username = username;
	this.password = password;
	this.adminID = adminID;
	this.role = role;
}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public int getAdminID() {
		return adminID;
	}

	public String getRole() {
		return role;
	}

}