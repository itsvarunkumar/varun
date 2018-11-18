package beans;

import java.util.Set;

public class User {
	private int id;
	private String Fname;
	private String Lname;
	private String Address;
	private Set<Phonenumber>phones;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public Set<Phonenumber> getPhones() {
		return phones;
	}
	public void setPhones(Set<Phonenumber> phones)
        {
		this.phones = phones;
	}

}
