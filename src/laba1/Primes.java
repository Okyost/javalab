package laba1;

public class Primes {
    public static void main(String[] args){
        for(int i = 2; i < 101; i++){
            if (isPrime(i)){
                System.out.print(i);
                System.out.print(' ');
            }
    }

    }
    public static boolean isPrime(int num) {
        int del = 0;
        for (int iteration = 1; iteration < num; iteration++) {
            if (num % iteration == 0) {
                del += 1;
            }
        }
        if (del <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
