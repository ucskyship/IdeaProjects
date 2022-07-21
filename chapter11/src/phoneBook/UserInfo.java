package phoneBook;

public class UserInfo {
    private String fullName;
    private String address;
    private String telephone;
    private String phone;

    private String email;

    public UserInfo(String fullName, String telephone) {
        this.fullName = fullName;
        this.telephone = telephone;
    }
public UserInfo(){}
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String number) {
        this.phone = number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

   @Override
    public String toString() {
        return String.format("""
                Full Name: %s
                Address: %s
                Telephone: %s, Phone: %s
                Email: %s
                """, getFullName(), getAddress(), getTelephone(), getPhone(), getEmail());
   }
}
