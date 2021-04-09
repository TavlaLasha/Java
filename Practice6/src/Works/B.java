package Works;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class B {
    protected String addr = "src/myFiles1";
    public boolean creteFolder(){
        File f = new File(addr);
        return f.mkdir();
    }

    public void m3(){
        try {
            for (int i=1; i<=30; i++) {
                FileWriter wrt = new FileWriter(addr + "/data"+i+".txt");
                wrt.write("Programmer");
                wrt.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
