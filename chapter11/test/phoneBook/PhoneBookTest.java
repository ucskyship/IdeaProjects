package phoneBook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBook phoneBook;
    UserInfo contactInfo;
    UserInfo contactInfo2;

    @BeforeEach
    @DisplayName
            ("To create contacts to use for unit testing")
    void setUp() {
        phoneBook = new PhoneBook();
        contactInfo = new UserInfo("UCJ", "+2348133856783");
        contactInfo2 = new UserInfo("JJ", "08133856583");
    }

    @Test
    @DisplayName
            ("To test that we can set user contact details for unit tests")
    void testThatUserDetailsISDefined() {
        assertEquals("UCJ", contactInfo.getFullName());
        contactInfo.setAddress("SabotNo1");
        assertEquals("SabotNo1", contactInfo.getAddress());
        assertEquals("+2348133856783", contactInfo.getTelephone());
        contactInfo.setPhone("08133885566");
        assertEquals("08133885566", contactInfo.getPhone());
        contactInfo.setEmail("love@gmail.com");
        assertEquals("love@gmail.com", contactInfo.getEmail());
        System.out.println(contactInfo);
    }

    @Test
    @DisplayName
            ("To test that phonebook is empty and available to add contacts")
    void testThatWeHaveEmptyArrayOfPhoneBook() {
        assertTrue(phoneBook.isEmpty());
    }

    @Test
    @DisplayName
            ("To test that we can add contacts to phonebook")
    void testThatWeCanAddUserInfo() {
        phoneBook.addUserInfo(contactInfo);
        assertEquals(1, phoneBook.getSize());
    }

    @Test
    @DisplayName
            ("To check that phonebook increments when more contacts are added")
    void testThatWeCanAddMoreUserInfo_sizeIncrements() {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        assertEquals(2, phoneBook.getSize());
        System.out.println(contactInfo);

    }

    @Test
    @DisplayName
            ("To test that we can delete from the phone book and that size decrements")
    void testThatWeCanRemoveContactFromPhoneBook() {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        phoneBook.removeUserInfo(contactInfo2);
        assertEquals(1, phoneBook.getSize());
    }

    @Test
    @DisplayName("This is to test that we can get contact" +
            " information by index and return the name")
    void testThatWeCanGetContactByIndex_getName() {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        assertEquals("UCJ", phoneBook.getContactInfo(0).getFullName());
    }

    @Test
    @DisplayName("This is to test that we can get contact" +
            " information by index and return the phone number")
    void testThatWeCanGetContactByIndex_getPhoneNumber() {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        assertEquals("+2348133856783", phoneBook.getContactInfo(0).getTelephone());
    }

    @Test
    @DisplayName
            ("Test to search for contacts by name and return telephone number")
    void testThatWeCanGetContactByName() throws UserInfoException {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        assertEquals("+2348133856783", phoneBook.getContact("UCJ").getTelephone());
    }

    @Test
    @DisplayName
            ("To test that we can update/edit contact information")
    void testThatWeUpdatePhoneBookWithUserInfo() throws UserInfoException {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        phoneBook.editUserInfo("UCJ", "LUCJAN");
        assertEquals("LUCJAN", phoneBook.getContact("LUCJAN").getFullName());
    }

    @Test
    @DisplayName
            ("To test that we can clear all contacts from phonebook")
    void testThatPhoneBookCanBeCleared() {
        phoneBook.addUserInfo(contactInfo);
        phoneBook.addUserInfo(contactInfo2);
        phoneBook.clearAllContact();
        assertEquals(0, phoneBook.getSize());
    }
}
//    @Test
//    void testThatWeCanReturnAllContact() {
//        phoneBook.addUserInfo(contactInfo);
//        phoneBook.addUserInfo(contactInfo2);
//        assertEquals(2, phoneBook.getAllContact());
//    }