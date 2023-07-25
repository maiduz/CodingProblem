package src.mathmatics;


//Write a Java program to print the first 10 prime numbers using for loop.
public class FirstTenPrimes {

    public static void main(String[] args) {
        int count = 0;  // count the number of primes found
        int num = 2;    // start with the first prime number

        while (count < 10) {
            boolean isPrime = true;   // assume num is prime

            // check if num is divisible by any number between 2 and num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;   // num is not prime
                    break;
                }
            }

            // if num is prime, print it and increment count
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;  // move on to the next number
        }
    }
}
