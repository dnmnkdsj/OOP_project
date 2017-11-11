package motor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataAccess {
    private String url;
    protected ArrayList<String> columns;
    protected String head;

    public void setUrl(String new_url) {
        this.url = new_url;
    }

    public String getUrl() {
        return this.url;
    }

    //open CSV file and get information into columns and head
    //IOException has no carrier
    public void readCSV(String url) throws IOException {

        File file = new File(url);
        System.out.printf("");
        InputStream file_stream = new FileInputStream(file);
        Scanner sc = new Scanner(file_stream,"UTF-8");
        String file_string =sc.useDelimiter("\\A").next();
        sc.close();

        columns = splitColumn(file_string);
        head = columns.get(1);
        columns.remove(0);
        columns.remove(0);
//        for (String str : columns) {
//            System.out.printf(str);
//        }
        //ArrayList<String> columns - one data
    }

    private ArrayList<String> splitColumn(String input) {
        String[] columns = input.split("\r");
//        System.out.print(columns.length);
        ArrayList<String> output = new ArrayList<String>(Arrays.asList(columns));
        //split input into pieces and store them into Arraylist
        return output;
    }

//    public static void main(String[] args) {
//        DataAccess test = new DataAccess();
//        test.url = "data/社团表.csv";
//        try {
//            test.readCSV(test.url);
//        } catch (IOException e) {
//            System.out.printf("//n IOException");
//        }
//    }
}
