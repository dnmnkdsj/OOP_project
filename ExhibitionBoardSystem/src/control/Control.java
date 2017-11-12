package control;

import motor.Activities;
import motor.ActivityAccess;
import motor.OrganizationAccess;
import motor.Organizations;

public class Control {
    static private Organizations organizations;
    static private Activities activities;

    public static void showOrganizationList() {
        System.out.print(organizations.getOrganizationList());
    }

    public static void showActivityList() {
        System.out.print(activities.getActivityList());
    }

    private static void initOrganizatins() {
        OrganizationAccess oa = new OrganizationAccess();
        oa.initOrganization();
        organizations = oa.getOrganizations();
    }

    private static void initActivities() {
        ActivityAccess aa = new ActivityAccess();
        aa.initActivities();
        activities = aa.getActivities();
    }

    public Control() {
        initActivities();
        initOrganizatins();
        //todo complete the constructer of control class
    }

    public static void main(String[] args) {
        Control control = new Control();
        showActivityList();
        showOrganizationList();
        //todo complete a controller that can control the system
    }
}
