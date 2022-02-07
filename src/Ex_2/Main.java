package Ex_2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    static boolean isPrime(int m){
        for (int i = 2; i <= sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> PrimeNumber(int InputNumber) {
        ArrayList<Integer> sequence = new ArrayList<>();
        if (isPrime(InputNumber)) {
            sequence.add(InputNumber);
        } else {
            for (int j = 2; j <= sqrt(InputNumber); j++) {
                if (InputNumber % j == 0 && isPrime(j)) {
                    sequence.add(j);
                }
            }
        }
        return sequence;
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            System.out.println(PrimeNumber(a));
        } catch (Exception e){
            System.out.println("Input number is not integer");
        }
    }
}
