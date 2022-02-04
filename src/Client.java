// This class will handle file parsing and storing

import java.io.*;

public class Client {
    // Methods
    public void readData() {
        BufferedReader br;
        String line;

        try {
            br = new BufferedReader(new FileReader("bank-Detail.csv"));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processData() {

    }

    public void printData() {

    }
}
