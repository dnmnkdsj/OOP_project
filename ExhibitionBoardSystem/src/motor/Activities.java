package motor;

import java.util.ArrayList;

public class Activities {
    private ArrayList<Activity> activities;

    public Activities() {
        //todo initalize a activity arraylist with empty attributes
    }

    public Activity findByName(String name) {
        for (Activity act : this.activities) {
            if (act.getName() == name) {
                return act;
            }
        }
        System.out.printf("this name is not found in Activities.");
        //todo can add an error exception
        return null;
    }

    //return a String of activities
    public String getActivityList() {
        String data = null;
        for (Activity act : this.activities) {
            data +=act.getName();
            data += "/n";
        }
        return data;
    }

    public ArrayList<Activity> getActivities() {
        return this.activities;
    }

    public void addActivity(Activity newAct) {
        this.activities.add(newAct);
    }

    public void deleteActivity(String name) {
        //todo find out whether this code is correct
        this.activities.remove(findByName(name));
    }

    public ArrayList<Activity> rangeActivitiesByTime(String start_time, String end_time) {
        ArrayList<Activity> acts = this.activities;
        for (Activity act : acts) {
            //todo delete all activities being not property.
        }
        return acts;
    }
}

