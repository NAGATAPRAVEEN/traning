package assigiment2.Assigment1;

public class smallbignumber {
    private static int i;

    public static boolean isprime(int num) {
        for(int i=2; i<num; i++){
            if(num % i ==0) {
                return false;
            }

        }
        return true;

    }

    public static int smallestPrime(int num) {
        for(int i = num-1; i > 0; i--) {
            if(isprime(i)) {
                return i;
            }
        }
        return i;
    }
    public static int biggerprime(int num) {
        int count = num +1;
        while(true){
            if(isprime(count)) {
                return count;
            }
            count++;
        }
    }
    public static void main(String[] args) {
        int num = input();
        if(isprime(num)) {
            System.out.println("it is prime itself"); 
        }
        else
        {
            int s1 = smallestPrime(num);
            int b1 = biggerprime(num);

            int s2 = smallestPrime(s1);
            int bs2 = biggerprime(s1);

            int b2 = smallestPrime(b1);
            int sb2 = biggerprime(b1);

            int solution = (s2 + b2)*(bs2+sb2);
            System.out.println("product="+ solution);
        }
    }

    private static int input() {
        return 0;
    }
}