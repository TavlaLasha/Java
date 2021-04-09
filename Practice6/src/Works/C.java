package Works;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C {
    protected String addr = "src/myFiles2";
    public boolean creteFolder(){
        File f = new File(addr);
        return f.mkdir();
    }

    public void m4(){
        try {
            for (int i=1; i<=30; i++) {
                FileWriter wrt = new FileWriter(addr + "/data"+i+".txt");
                Integer ig = i;
                wrt.write("Programmer"+ ig.toString());
                wrt.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
