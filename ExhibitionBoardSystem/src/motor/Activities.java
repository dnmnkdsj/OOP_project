package motor;

import java.util.ArrayList;

public class Activities {
    private ArrayList<Activity> activities;

    public Activities() {
        ArrayList<Activity> activities = new ArrayList<Activity>();
    }

    public Activity findByName(String name) {
        for (Activity act : this.activities) {
            if (act.getName() == name) {
                return act;
            }
        }
        System.out.printf("this name is not found in Activities.");
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
        this.activities.remove(findByName(name));
    }

    public ArrayList<Activity> rangeActivitiesByTime(String start_time, String end_time) {
        ArrayList<Activity> acts = this.activities;
        for (Activity act : acts) {
            if (Integer.valueOf(act.getTime()).intValue() < Integer.valueOf(start_time).intValue()) {
                acts.remove(act);
            } else if (Integer.valueOf(act.getTime()).intValue() > Integer.valueOf(end_time).intValue()) {
                acts.remove(act);
            }
        }
        return acts;
    }
}

