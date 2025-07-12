package crm_project;

public class CRMService {
    private DataStore dataStore = new DataStore();

    public void addNewLead(int id, String name, String email, String phoneNumber, String source) {
        Lead lead = new Lead(id, name, email, phoneNumber, source);
        dataStore.addLead(lead);
    }

    public void addNewContact(int id, String name, String email, String phoneNumber, String address, String interactionHistory) {
        Contact contact = new Contact(id, name, email, phoneNumber, address, interactionHistory);
        dataStore.addContact(contact);
    }

    public void convertLeadToContact(int leadId, String address, String interactionHistory) {
        dataStore.convertLeadToContact(leadId, address, interactionHistory);
    }

    public void displayAllLeads() {
        for (Lead lead : dataStore.getLeads()) {
            lead.displayLeadInfo();
            System.out.println();
        }
    }

    public void displayAllContacts() {
        for (Contact contact : dataStore.getContacts()) {
            contact.displayContactInfo();
            System.out.println();
        }
    }
}
