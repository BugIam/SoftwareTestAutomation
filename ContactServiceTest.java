//Darkenley Minviel
//04/05/2022
//CS 320 T4514
// Final project
package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import contact.Contact;
import contact.ContactService;

class ContactServiceTest {
//testing for the requirements: each test name indicates the function being tested
	@Test
	void testAdd() {
		ContactService c1 = new ContactService();
		Contact contactObject = new Contact("123456789","Darkenley","Minviel","8578694546","9 Francis Ave Mansfield");
		Contact c2 = new Contact("4456","Calvens","Minviel","5094356978","7 Francis Ave Mansfield");
		
		assertEquals(true, c1.addContact(contactObject));
	
		}

	@Test
	void testDelete()
	{
	ContactService cs = new ContactService();
	Contact c1 = new Contact("02221998", "Darkenley", "Minv", "91150843", "9 F st ");
	Contact c2 = new Contact("02222022", "Cal", "Minva", "619453404", "8 F st ");
	Contact c3 = new Contact("02222023", "Ken", "Minvn", "8571793", "10 F St");
	
	cs.addContact(c1);
	cs.addContact(c2);
	cs.addContact(c3);

	assertEquals(true, cs.deleteContact("02221998"));
	assertEquals(false, cs.deleteContact("023454"));
	assertEquals(false, cs.deleteContact("02221998"));
	}
	@Test
	void testUpdate() {
	ContactService cs = new ContactService();
	Contact c1 = new Contact("987321000","Darkenley","Gang","8578694546","9 Francis Ave Mansfield");

	cs.addContact(c1);

	
	assertEquals(true, cs.updateContact("987321000", "Dark", "Minviel", "5085774162", "22 Francis Ave, Mansfield"));
	assertEquals(false, cs.updateContact("2345", "Darkenley", "Minviel", "5085774162", "844 Pelissier CIr Mansfield"));
	}
}

