import java.util.Stack;

public class service {
    public static void main(String[] args) {
        Stack<String> service = new Stack<>();

        service.push("Customer Name: Praveen");
        service.push("Mobile no :954211592");
        service.push("gender:Male");
        service.push("Token Fee : 5000");
        service.push("Repairfull: service");
        service.pop();

        System.out.println("customer details :" + service);
    }
    
}
