package motor;

public class Activity {
    private String name;
    private String time;
    private String site;
    private Organizations organizations;
    private String slogan;
    private String remark;

    //return Activity details
    public String showDetails() {
        String data = null;
        //TODO showDetails1
        return data;
    }

    public Activity() { }

    public Activity(String name, String time, String site,
                    Organizations organizations,
                    String slogan, String remark) {
        this.name = name;
        this.time = time;
        this.site = site;
        this.organizations = organizations;
        this.slogan = slogan;
        this.remark = remark;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return this.time;
    }

    public Organizations getOrganizations() {
        return this.organizations;
    }

    public String getSlogan() {
        return this.slogan;
    }
}
