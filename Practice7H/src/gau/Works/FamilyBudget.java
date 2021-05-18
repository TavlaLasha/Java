package gau.Works;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FamilyBudget {
    private int money;
    protected String addr = "src/gau/Works/FamilyData";

    public void setMoney(int money) {
        this.money = money;
        saveBudgetState();
    }

    public int getMoney() {
        return money;
    }

    public String determineBudgetState(){
        if (money>40000){
            return "Rich";
        }else if(money>10000){
            return "Medium";
        }
        else{
            return "Poor";
        }
    }
    public void saveBudgetState(){
        creteFolder();
        try {
            FileWriter wrt = new FileWriter(addr+"/budget.txt");
            Date date = new Date();
            wrt.write(date.toString() + "--> " + determineBudgetState());
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
