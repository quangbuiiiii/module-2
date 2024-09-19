package bai-tap-1;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        double ratio =23000;
        double vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD");
        double usd = sc.nextDouble();
        vnd =usd*ratio;
        System.out.println(usd+"USD ="+vnd+" VND.");
    }
}
