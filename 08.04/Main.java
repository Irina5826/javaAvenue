import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\asus\\Documents\\test.txt");
            int c;
            String ip = "";
            String port = "";
            String proxy = "";
            while ((c = reader.read()) != -1){
                if (c==13) continue;
                if(c == 10){
                    ip = proxy.split(":")[0];
                   port=proxy.split(":")[1];
                   proxy = "";
                    System.out.println("ip: "+ip+"port: "+port);
                }
                else if (c != 9) {
                    proxy += (char)c;
                }else {
                    proxy += ":";
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }










        /*try {
            FileWriter writer = new FileWriter("C:\\Users\\asus\\Documents\\test.txt", true);
            String text = "Hello Word";
            writer.write(text);
            writer.append("\n");
            writer.write("HELLO WORD");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
