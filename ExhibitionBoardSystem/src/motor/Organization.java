package motor;

import java.util.ArrayList;

public class Organization {
    private String name;
    private String time;
    private String principal;
    private String phone;
    private String email;
    private ArrayList<String> members;
    private Activities activities;
    private String introduction;

    //show a String including all attributes
    public String showDetials() {
        //TODO
        return null;
    }

    //return Organizations's name
    public String getName() {
        return this.name;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public Activities getActivities() {
        return activities;
    }

}
