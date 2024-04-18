package xpath.and.methods;

import java.io.*;

public class LogFile {
    public static void LogIntoFile(String MsgToFile) throws IOException {
        File f1 = new File("log.txt");
        FileWriter fw = new FileWriter(f1, true);  // Залишити коментар
        PrintWriter pw = new PrintWriter(fw);
        pw.println(MsgToFile);
        pw.flush();
        pw.close();
    }
}
