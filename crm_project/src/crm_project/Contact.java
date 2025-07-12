package crm_project;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String interactionHistory;

    public Contact(int id, String name, String email, String phoneNumber, String address, String interactionHistory) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.interactionHistory = interactionHistory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInteractionHistory() {
        return interactionHistory;
    }

    public void setInteractionHistory(String interactionHistory) {
        this.interactionHistory = interactionHistory;
    }

    public void displayContactInfo() {
        System.out.println("Contact ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Interaction History: " + interactionHistory);
    }
}
