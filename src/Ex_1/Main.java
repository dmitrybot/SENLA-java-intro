package Ex_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i = 0; i < str.length(); ++i){
            char c = str.charAt(i);
            if(c >= '0' && c <= '9')
            {
                sum += c - '0';
            }
        }
        System.out.println(sum);
    }
}
