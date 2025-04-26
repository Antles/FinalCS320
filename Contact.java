
public class Contact {
    //The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
    //The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
    //The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
    //The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
    //The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String firstName, String lastName, String phone, String address) {

        // check first name
        if (firstName == null){
            throw new IllegalArgumentException("firstName cannot be null");
        }
        if(firstName.length() > 10){
            throw new IllegalArgumentException("firstName cannot be longer than 10 characters");
        }

        // check lastName
        if (lastName == null){
            throw new IllegalArgumentException("lastName cannot be null");
        }
        if(lastName.length() > 10){
            throw new IllegalArgumentException("lastName cannot be longer than 10 characters");
        }

        // check phone
        if (phone == null){
            throw new IllegalArgumentException("phone cannot be null");
        }
        if(phone.length() != 10){
            throw new IllegalArgumentException("phone number must be 10 numbers");
        }
        if (address == null){
            throw new IllegalArgumentException("address cannot be null");
        }
        if(address.length() > 30){
            throw new IllegalArgumentException("address cannot be longer than 30 characters");
        }

        // check address

        this.contactId = "0000000001";
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters for contact
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Setters for contact
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("firstName cannot be null or longer than 10 characters");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("lastName cannot be null or longer than 10 characters");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() !=  10){
            throw new IllegalArgumentException("phone cannot be null and must be 10 digits");
        }
        this.phone = phone;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30){
            throw new IllegalArgumentException("address cannot be null or longer than 10 characters");
        }
        this.address = address;
    }
}
