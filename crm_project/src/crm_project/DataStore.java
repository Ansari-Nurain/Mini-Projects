package crm_project;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private List<Lead> leads = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    public void addLead(Lead lead) {
        leads.add(lead);
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Lead> getLeads() {
        return leads;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Lead getLeadById(int id) {
        for (Lead lead : leads) {
            if (lead.getId() == id) {
                return lead;
            }
        }
        return null;
    }

    public Contact getContactById(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public void convertLeadToContact(int leadId, String address, String interactionHistory) {
        Lead lead = getLeadById(leadId);
        if (lead != null) {
            Contact contact = new Contact(
                lead.getId(),
                lead.getName(),
                lead.getEmail(),
                lead.getPhoneNumber(),
                address,
                interactionHistory
            );
            addContact(contact);
            leads.remove(lead);
        }
    }
}
