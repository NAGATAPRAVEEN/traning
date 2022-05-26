import java.util.Stack;


public class Medicalshop  {
    public static void main(String[] args) {
        Stack<String> medical =new  Stack<>();
        medical.push("Patient Name : praveen");
        medical.push("Age:22");
        medical.push("Gender:male");
        medical.push("Mobile:954211592");
        medical.push("Diseas:Fever");
        medical.push("Token Fee:500");
        medical.push("doctor priya");

        System.out.println("Patient Details:" + medical);
        
    }

}