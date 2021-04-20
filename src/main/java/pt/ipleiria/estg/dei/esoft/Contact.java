package pt.ipleiria.estg.dei.esoft;

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(String firstName, String lastName, String comm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = comm;
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
}
