import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class BankRecords {
    // Variables
    static BankRecords[] robjs = new BankRecords[600];
    static ArrayList<String> bankDetails = new ArrayList<>(600); // Hold spreadsheet rows+columns

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

    // Code Definitions
    Client client = new Client() {
        @Override
        void readData() {
            BufferedReader br;
            try {
                br = new BufferedReader(new FileReader("bank-Detail.csv"));

            }
            catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }

        @Override
        void processData() {

        }

        @Override
        void printData() {

        }
    };
}
