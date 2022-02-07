import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Child-class of parent-class Client
public class BankRecords extends Client{
    // Variables
    static BankRecords[] bankEntry = new BankRecords[600];
    static ArrayList<List<String>> bankAccDetails = new ArrayList<>(600); // Hold spreadsheet rows+columns

    private String id;
    private int age;
    private String sex;
    private String region;
    private double income;
    private String isMarried;
    private int children;
    private String hasCar;
    private String hasSaveAct;
    private String hasCurrentAct;
    private String hasMortgage;
    private String hasPep;

    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public void setIncome(double income) {
        this.income = income;
    }
    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }
    public void setChildren(int children) {
        this.children = children;
    }
    public void setHasCar(String hasCar) {
        this.hasCar = hasCar;
    }
    public void setHasSaveAct(String hasSaveAct) {
        this.hasSaveAct = hasSaveAct;
    }
    public void setHasCurrentAct(String hasCurrentAct) {
        this.hasCurrentAct = hasCurrentAct;
    }
    public void setHasMortgage(String hasMortgage) {
        this.hasMortgage = hasMortgage;
    }
    public void setHasPep(String hasPep) {
        this.hasPep = hasPep;
    }

    // Getters
    public String getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
    public String getRegion() {
        return region;
    }
    public double getIncome() {
        return income;
    }
    public String getIsMarried() {
        return isMarried;
    }
    public int getChildren() {
        return children;
    }
    public String getHasCar() {
        return hasCar;
    }
    public String getHasSaveAct() {
        return hasSaveAct;
    }
    public String getHasCurrentAct() {
        return hasCurrentAct;
    }
    public String getHasMortgage() {
        return hasMortgage;
    }
    public String getHasPep() {
        return hasPep;
    }

    @Override
    public void readData() {
        BufferedReader br;
        String line;

        // Attempt to read file and set each .csv row as a comma-separated array
        try {
            br = new BufferedReader(new FileReader("bank-Detail.csv"));
            while ((line = br.readLine()) != null) {
                bankAccDetails.add(Arrays.asList(line.split(",")));
            }
            processData();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void processData() {
        int i = 0;

        // Go through each entry in 'bankAccDetails' and create a new bankEntry obj while populating
        // each field appropriately
        for (List<String> rowData: bankAccDetails) {
            bankEntry[i] = new BankRecords();
            bankEntry[i].setId(rowData.get(0));
            bankEntry[i].setAge(Integer.parseInt(rowData.get(1)));
            bankEntry[i].setSex(rowData.get(2));
            bankEntry[i].setRegion(rowData.get(3));
            bankEntry[i].setIncome(Double.parseDouble(rowData.get(4)));
            bankEntry[i].setIsMarried(rowData.get(5));
            bankEntry[i].setChildren(Integer.parseInt(rowData.get(6)));
            bankEntry[i].setHasCar(rowData.get(7));
            bankEntry[i].setHasSaveAct(rowData.get(8));
            bankEntry[i].setHasCurrentAct(rowData.get(9));
            bankEntry[i].setHasMortgage(rowData.get(10));
            bankEntry[i].setHasPep(rowData.get(11));
            i++;
        }
        printData();
    }

    @Override
    public void printData() {
        System.out.println(
                "ID \t\t| AGE |   SEX   |   REGION   | INCOME | MARRIED | CHILDREN |  CAR  | SAVE ACT | CURRENT ACT | MORTGAGE | PEP");

        for (int i = 0; i < 25; i++) {
            System.out.printf("%-9s %d \t %-9s %-10s %.2f\t%-10s\t%-9d %-4s \t\t%-4s \t\t%-4s \t\t%-2s\t\t %-5s\n",
                    bankEntry[i].getId(), bankEntry[i].getAge(), bankEntry[i].getSex(), bankEntry[i].getRegion(),
                    bankEntry[i].getIncome(), bankEntry[i].getIsMarried(), bankEntry[i].getChildren(),
                    bankEntry[i].getHasCar(), bankEntry[i].getHasSaveAct(), bankEntry[i].getHasCurrentAct(),
                    bankEntry[i].getHasMortgage(), bankEntry[i].getHasPep());
        }
    }
}
