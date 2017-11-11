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
        //TODO showDetails
        return data;
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
