package motor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class OrganizationAccess extends DataAccess {

    private Organizations organizations;

    public OrganizationAccess() {
        setUrl("data/社团表.csv");
        try {
            readCSV(this.getUrl());
        } catch (IOException e) {
            System.out.printf("!!!!!社团表.csv is not exist.!!!!!");
        }
    }

    //import data into Organizations
    public void initOrganization() {
        for (String column : this.columns) {
            storeColumn(column);
        }
    }

    private void storeColumn(String column) {
        String[] columnData= column.split(",");
        String name = columnData[0];
        String time = columnData[1];
        String principal = columnData[2];
        String phone = columnData[3];
        String email = columnData[4];
        ArrayList<String> members = new ArrayList<String>(Arrays.asList(columnData[5].split("、")));
        Activities activites = new Activities();
        //todo these activities are not unique
        String actString = columnData[5];
        String[] acts = actString.split("、");
        for (String act : acts) {
            Activity temp = new Activity();
            temp.setName(act);
            activites.addActivity(temp);
        }
        String introduction = columnData[6];
        Organization newOrg = new Organization(name,time,principal,phone,email,members,activites,introduction);
        this.organizations.addOrganization(newOrg);
    }

//    public void main(String[] args) {
//        DataAccess th = new DataAccess();
//        initOrganization();
//    }

}
