package motor;

import java.util.ArrayList;

public class DataAccess {
    private String url;
    private ArrayList<String> columns;
    private String head;

    public void setUrl(String new_url) {
        this.url = new_url;
    }

    public String getUrl() {
        return this.url;
    }

    public void readCSV(String url) {
        //todo open CSV file and get information into columns and head;
    }

    //todo considering how to get the first column and put it as head
    private ArrayList<String> splitColumn(String input) {
        ArrayList<String> output = null;
        //todo split input into pieces and store them into Arraylist
        return output;
    }
}
