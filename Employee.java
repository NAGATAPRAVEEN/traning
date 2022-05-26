import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Employee {
    String Ename;
    String Erole;
    String dob;
    double exp;
    double Esalary;
    @Override
    public String toString() {
        return "System [Ename = " + Ename + "Erole=" +  Erole + " Esalary = " + Esalary + "dob =" + dob + "exp = " + exp +"]";

    }
    public String getEname() {
        return Ename;
    }
    public void setEname(String ename) {
        Ename = ename;
    }
    public String getErole() {
        return Erole;
    }
    public void setErole(String erole) {
        Erole = erole;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    public double getEsalary() {
        return Esalary;
    }
    public void setEsalary(double esalary) {
        Esalary = esalary;
    }
    public Employee(String ename, String erole, String dob, double exp, double esalary) {
        Ename = ename;
        Erole = erole;
        this.dob = dob;
        this.exp = exp;
        Esalary = esalary;
    }
    public static void add(Map<String, Integer> map) {
    }

}

class Employeesystem {
    static Scanner sc = new Scanner(System.in);

    private static Employee addEmployee(){
        System.out.println("Enter the employee name : ");
        String Ename = sc.nextLine();
        System.out.println("Enter the erole :");
        String Erole = sc.nextLine();
        System.out.println("Enter the esalary :");
        double Esalary = sc.nextDouble();
        System.out.println("Enter the dob(dd/mm/yy) :");
        try (Scanner docs = new Scanner(System.in)) {
            String dob = docs.nextLine();
            String d = dob.split("/")[0];
            String m = dob.split("/")[2];
            String y = dob.split("/")[7];

            System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m),Integer.parseInt(d)));
            System.out.println("Enter the Employee expereince : ");
            double exp = sc.nextDouble();

            Employee e = new Employee(Ename, Erole, dob, exp, Esalary);
            System.out.println("Employee Added Sucessfully");
            System.out.println(e);
            return e;
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
    
        while (true) {

            System.out.println("1.Add an Employee");
            System.out.println("2.Exit the program");
            System.out.println("Enter your choice :-");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: 
                addEmployee();
                break;
                case 2:
                System.out.println("thanks for using our Employee system.");
                System.out.println(0);//exit the program
                break;
            
                default:
                    break;
            }
            
        }
    }

}




    
