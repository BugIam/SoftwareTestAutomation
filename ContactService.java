//Darkenley Minviel
//04/05/2022
//CS 320 T4514
// Final project
package contact;

import java.util.*;

public class ContactService {
	private ArrayList<Contact> listOfContact;
	
	public ContactService() {
		listOfContact = new ArrayList<>();
	}
	
	//functionality : Add a contact
	public boolean addContact(Contact contactObject) {
		boolean ifContactExist = false;
		
		//Verify if contact alreaday exist
		for (Contact c1 : listOfContact) {
			if (c1.equals(contactObject)) {
				ifContactExist = true;
			}
		}
		//add contact to list if do no exsit
		if(!ifContactExist) {
			listOfContact.add(contactObject);
			return true;
		}
		else {
			return false;
		}
			
	}
	
	// functionality : delete a contact
	public boolean deleteContact(String cid) {
		
		//Verify ID uniqueness
			for (Contact c1: listOfContact) {
				if(c1.getContactID().equals(cid)) {
					listOfContact.remove(c1);
					return true;
				}
			}
				return false;
		
	}
			
			


	
	// functionality: Update Contact list
	public boolean updateContact (String cid, String fname, String lname, String pNumber, String addy) {
		for(Contact c1:listOfContact) {
			if(c1.getContactID().equals(cid)){
				//Verify new information for requirements and update contact information
				if (!fname.equals("") && !(fname.length()>10)) {
					c1.setFirstName(fname);
				}
				
				if (!lname.equals("") && !(lname.length()>10)) {
					c1.setLastName(lname);
				}
				
				if (!pNumber.equals("") && !(pNumber.length()>10)) {
					c1.setPhoneNumber(pNumber);
				}
				
				if (!addy.equals("") && !(addy.length()> 30)) {
					c1.setAddress(addy);
				}
				
				return true;
			}
			
		}
		return false;
	}
	
}
	


