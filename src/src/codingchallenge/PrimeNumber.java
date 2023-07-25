package src.codingchallenge;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 16;
        boolean isPrime = true;

        for (int i = 2; i <= num/2; i++) {  // loop to check if the number is divisible by any number between 2 and num/2
            if (num % i == 0) {  // check if the number is divisible by i
                isPrime = false;
                break;  // exit the loop if the number is not prime
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
