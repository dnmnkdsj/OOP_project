package control;

import motor.Activities;
import motor.Organizations;

public class Control {
    static private Organizations organizations;
    static private Activities activities;

    public void showOrganizationList() {
        System.out.print(organizations.getOrganizationList());
    }

    public void showActivityList() {
        System.out.print(activities.getActivityList());
    }

    private void initOrganizatins() {
        //todo
    }

    private void initActivities() {
        //todo
    }

    public Control() {
        initActivities();
        initOrganizatins();
        //todo complete the constructer of control class
    }

    public static void main(String[] args) {
        Control control = new Control();
        //todo complete a controller that can control the system
    }
}
