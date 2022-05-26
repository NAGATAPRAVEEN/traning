package assigiment2;

import java.util.Scanner;

public class primenearestnumber {

    public static boolean isprime(int n) {
        for(int i = 4;i< n;i++) {
            if (n%i==0) {
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isprime(n)) {
            System.out.println("Nearest Prime is the number");
        }
        else
        {
            int smallestPrime = -1;
            int bigPrime = -1;

            for(int i = n; i>0;i++){
                if(isprime(smallestPrime)){
                    break;
                }
            }
            int count = n+1;
            while (true) {
                if (isprime(count)) {
                    bigPrime=count;
                    break;
                }
                count++;
            }

            int steps1 = bigPrime - n;
            int step2 = n - smallestPrime;

            if (steps1 <step2) {
            }
            else
            {
            }
            System.out.println("nearest prime number");
        }
        sc.close();

    }

}


                    

