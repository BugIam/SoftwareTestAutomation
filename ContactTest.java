//Darkenley Minviel
//04/05/2022
//CS 320 T4514
// Final project
package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//testing for the requirements: each test name indicates the function being tested

class ContactTest {

		@Test
		void testContactIDTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,()->{new Contact("01234567900","Darkenley", "Minviel", "8578694546","9 Francis Ave Mansfield");
			});
		}
		
		@Test
		void testContactIDNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact(null,"Darkenley","Minviel", "8578694546","9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testFirstNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{ new Contact("0123456789","Darkenley Minviel","Minviel","8578694546","9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testFirstNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("0123456789",null,"Minviel", "8578694546","9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testLastNameTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("1234567890","Darkenley","MinvielRaymond","8578694546","9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testLastNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("0123456789","Darkenley",null, "7145551234","9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testPhoneNumberTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("0123456789","Darkenley","Minviel","8578694546000","9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testPhoneNumberNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("0123456789","Darkenley","Minviel",null,"9 Francis Ave Mansfield");
		});
		}
		
		@Test
		void testAddressTooLong() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("0123456789","Darkenley","Minviel", "8578694546","9 Francis Ave Mansfield Massachusetts US 02048");
		});
		}
		
		@Test
		void testAddressNull() {
			Assertions.assertThrows(IllegalArgumentException.class,() ->{new Contact("0123456789","Darkenley","Minviel","8578694546",null);
		});
		}
}
