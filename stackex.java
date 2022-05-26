

public class stackex {
    public static void main(String[] args) {
        stack<Integer> s = new stack<>();
        

        s.push(80);
        s.push(90);
        s.push(35);

        s.pop();
        
        System.out.println(s.isEmpty());

    
        System.out.println(s);
    }
    
}
