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

    public Organization(String name, String time, String principal,
                        String phone, String email, ArrayList<String> members,
                        Activities activities, String introduction) {
        this.name = name;
        this.time = time;
        this.principal = principal;
        this.phone = phone;
        this.email = email;
        this.members = members;
        this.activities = activities;
        this.introduction = introduction;
    }

    //show a String including all attributes
    public String showDetials() {
        //TODO showDetails
        return null;
    }

    //return Organizations's name
    public String getName() {
        return this.name;
    }

    public ArrayList<String> getMembers() {
        return this.members;
    }

    public Activities getActivities() {
        return this.activities;
    }

}
