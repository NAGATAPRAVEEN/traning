
public class impl  implements inex {

    @Override
    public void dance() {
        System.out.println("Dancing");
        
    }

    @Override
    public void hello() {
        System.out.println("Hello");
        
    }

    @Override
    public void start() {
        System.out.println("Start");
        
    }

    @Override
    public void swim() {
        System.out.println("Swim");
        
    }

    @Override
    public void talk() {
        System.out.println("Talk");
        
    }
     public static void main(String[] args) {
         new impl().dance();
         new impl().hello();
         new impl().start();
         new impl().swim();
         new impl().talk();
     }

    }

    
    
