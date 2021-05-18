package gau.Works;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FamilyMember {
    private String name, lastName, age, status;
    protected String addr = "src/gau/Works/FamilyData";

    public FamilyMember(String name, String lastName, String age, String status){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
        saveFamily();
    }
    public void saveFamily(){
        creteFolder();
        try {
            FileWriter wrt = new FileWriter(addr+"/family.txt");
            Date date = new Date();
            wrt.write("Name: " + name + "\nLastName: " + lastName + "\nAge: " + age + "\nStatus: " + status);
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void creteFolder(){
        File directory = new File(addr);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }
}
