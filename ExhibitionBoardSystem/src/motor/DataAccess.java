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
    private ArrayList<String> columns;
    private String head;

    public void setUrl(String new_url) {
        this.url = new_url;
    }

    public String getUrl() {
        return this.url;
    }

    //IOException has no carrier
    public void readCSV(String url) throws IOException {
        //todo open CSV file and get information into columns and head;

        File file = new File(url);
        System.out.printf("");
        InputStream file_stream = new FileInputStream(file);
        Scanner sc = new Scanner(file_stream,"UTF-8");
        String file_string =sc.useDelimiter("\\A").next();
        sc.close();
//        System.out.printf(file_string);
        columns = splitColumn(file_string);
//        for (String str : columns) {
//            System.out.printf(str);
//        }
    }

    //todo considering how to get the first column and put it as head
    private ArrayList<String> splitColumn(String input) {
        ArrayList<String> output = new ArrayList<String>(Arrays.asList(input));
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
