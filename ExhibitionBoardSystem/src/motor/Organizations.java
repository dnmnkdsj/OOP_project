package motor;

import java.util.ArrayList;

public class Organizations {
    private ArrayList<Organization> organizations;

    public Organizations() {
        //TODO initialize a Organizations class with no attribute
    }

    public Organization findByName(String name) {
        for (Organization org : this.organizations) {
            if (org.getName() == name) {
                return org;
            }
        }
        System.out.printf("This organization is not found in Organizations.");
        return null;
    }

    public String getOrganizationList() {
        String data = null;
        for (Organization org : this.organizations) {
            data +=org.getName();
            data += "/n";
        }
        return data;
    }

    public ArrayList<Organization> getOrganizations() {
        return this.organizations;
    }

    public void addOrganization(Organization newOrg) {
        this.organizations.add(newOrg);
    }

    public void deleteOrganization(String name) {
        Organization del = findByName(name);
        //todo delete del from arraylist
    }
}
