package Ex_5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер сейфа");
        int m = scan.nextInt();
        System.out.println("Введите количество предметов");
        int n = scan.nextInt();
        int[][] d = new int[n][m + 1];
        System.out.println("Введите характеристики предметов (стоимость, объем)");
        int item_cost = scan.nextInt(), item_weight = scan.nextInt();
        for (int i = 0; i <= m; ++i)
            if (item_weight <= i) d[0][i] = item_cost;
        for (int i = 1; i < n; ++i) {
            item_cost = scan.nextInt(); item_weight = scan.nextInt();
            for (int j = 0; j <= m; ++j){
                if (item_weight <= j)
                    if (d[i - 1][j] < item_cost + d[i - 1][j - item_weight]){
                        d[i][j] = item_cost + d[i - 1][j - item_weight];
                        //System.out.println(i + " " + j + " " + d[i - 1][j] + " " + d[i][j] + " " + item_weight + " " + item_cost + " " + item_cost + " " + d[i - 1][j - item_weight]);
                    }
                    else
                        d[i][j] = d[i - 1][j];
                else
                    d[i][j] = d[i - 1][j];
                //System.out.println(i + " " + j + " " + d[i - 1][j] + " " + d[i][j] + " " + item_weight + " " + item_cost);
            }
        }
        /*for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m + 1; ++j){
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println(d[n - 1][m]);
    }
}
