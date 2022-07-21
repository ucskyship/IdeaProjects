package phoneBook;

import java.util.ArrayList;

import java.util.List;

public class PhoneBook {
    private final List<UserInfo> phoneBookArrays = new ArrayList<>();

    public PhoneBook(){

    }

    public PhoneBook(UserInfo userInfo) {
        this.phoneBookArrays.add(userInfo);
    }

    public boolean isEmpty() {
        return phoneBookArrays.size() == 0;
    }

    public void addUserInfo(UserInfo contactInfo) {
        phoneBookArrays.add(contactInfo);
    }

    public int getSize() {
        return phoneBookArrays.size();
    }

    public void removeUserInfo(UserInfo contactInfo) {
        phoneBookArrays.remove(contactInfo);
    }

    public UserInfo getContactInfo(int index) {
        return phoneBookArrays.get(index);
    }

    public UserInfo getContact(String name) throws UserInfoException {
        UserInfo phoneNumber = null;
        for (UserInfo check : phoneBookArrays) {
            if (check.getFullName().equalsIgnoreCase(name)) {
                phoneNumber = check;
                break;
            }
        }
        if (phoneNumber == null) {
            throw new UserInfoException("contact does not exist");
        }
        return phoneNumber;
    }

    public void editUserInfo(String oldInfo, String newInfo) throws UserInfoException {
        getContact(oldInfo).setFullName(newInfo);
    }

    public void clearAllContact() {
        phoneBookArrays.clear();
    }

//    public UserInfo[] getAllContact() {
//        for (int i = 0; i < phoneBookArrays.size(); i++) {
//            phoneBookArrays.
//        }
//    }
}