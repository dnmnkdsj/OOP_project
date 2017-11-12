package motor;

import java.util.ArrayList;

public class Organizations {
    private ArrayList<Organization> organizations;

    public Organizations() {
        ArrayList<Organization> organizations = new ArrayList<Organization>(0);
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
            data += org.getName();
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
        this.organizations.remove(findByName(name));
    }
}
