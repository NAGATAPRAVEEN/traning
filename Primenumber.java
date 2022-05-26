

public class Primenumber  {
    public static void main(String[] args) {
        
        for(int x=1;x<=50;x++) {
            boolean status = true;
            for(int y=2;y<x;y++) {
                if (x%y==0) {
                    status = false;
                }

            }

            if (status && x>1) {
                System.out.println(x+"");

            }

        }

    }

}
                
    
