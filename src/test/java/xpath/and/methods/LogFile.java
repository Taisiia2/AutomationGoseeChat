package xpath.and.methods;

import java.io.*;
import java.util.Date;

public class LogFile {
    public static void LogIntoFile(String MsgToFileTrue,String MsgToFileFalse, boolean res) throws IOException {
        Date date = new Date();
        File f1 = new File("log.txt");
        FileWriter fw = new FileWriter(f1, true);  // Залишити коментар
        PrintWriter pw = new PrintWriter(fw);
        if (res == true){
            pw.println(date +" "+MsgToFileTrue);
        }else {
            pw.println(date +" "+MsgToFileFalse);
        }
        pw.flush();
        pw.close();
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
