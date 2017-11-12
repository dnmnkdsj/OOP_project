package motor;

import java.io.IOException;

public class ActivityAccess extends DataAccess {

    private Activities activities;

    public ActivityAccess() {
        setUrl("data/活动表.csv");
        try {
            readCSV(this.getUrl());
        } catch (IOException e) {
            System.out.printf("活动表不存在");
        }
    }

    //import data into Activities
    public void initActivities() {
        for (String column : this.columns) {
            storeColumn(column);
        }
    }

    private void storeColumn(String column) {
        String[] columnData= column.split(",");
        String name = columnData[0];
        String time = columnData[1];
        String site = columnData[2];
        Organizations organizations = new Organizations();
        String[] Orgs = columnData[3].split("、");
        for (String Org : Orgs) {
            Organization temp = new Organization();
            temp.setName(Org);
            organizations.addOrganization(temp);
        }
        String slogan = columnData[4];
        String remark = columnData[5];
        Activity newAct = new Activity(name, time, site, organizations, slogan, remark);
        this.activities.addActivity(newAct);
    }

    public Activities getActivities() {
        return this.activities;
    }
}
