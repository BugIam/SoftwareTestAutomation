//Darkenley Minviel
//04/05/2022
//CS 320 T4514
// Final project
package contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String cid, String fname, String lname, String pnumber, String addy) {
		//Handling null value or exceeding length requirement
		if (cid == null || cid.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID - Cannot be empty or excedding 10 charaters.");
		}
		if (fname == null || fname.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name - Cannot be empty or excedding 10 charaters.");
		}
		if (lname == null || lname.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name - Cannot be empty or excedding 10 charaters.");
		}
		if (pnumber == null || pnumber.length() > 10) {
			throw new IllegalArgumentException("Invalid Phone Number - Cannot be empty or excedding 10 charaters.");
		}
		if (addy == null || addy.length() > 30) {
			throw new IllegalArgumentException("Invalid Address - Cannot be empty or excedding 30 charaters.");
		}
		
		this.contactID= cid;
		this.firstName = fname;
		this.lastName = lname;
		this.phoneNumber = pnumber;
		this.address = addy;
	}
	

	//getters
	public String getContactID() {
			return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//setters
	public void setContactID(String cid) {
		this.contactID = cid;
	}
	
	public void setFirstName(String fname) {
		this.firstName = fname;
	}
	
	public void setLastName(String lname) {
		this.lastName= lname;
	}
	
	public void setPhoneNumber(String pnumber) {
		this.phoneNumber=pnumber;
	}
	public void setAddress(String addy) {
		this.address = addy;
	}

}
