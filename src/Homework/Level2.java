package Homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        double a = 1;
        double b = 1;
        double c = 1;
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = BigDecimal.valueOf(c);
        System.out.println("输入总数字：");
        double n = sa.nextInt();
        System.out.println("输入抽取数：");
        double k = sb.nextInt();
        BigDecimal n1 = BigDecimal.valueOf(n);
        for (int i = 0; i < k; i++) {
            a1 = a1.multiply(n1);
            n--;
            n1 = BigDecimal.valueOf(n);
            b1 = b1.multiply(c1);
            c++;
            c1 = BigDecimal.valueOf(c);
        }
        BigDecimal r =b1.divide(a1,16, RoundingMode.HALF_UP);
        System.out.println("中奖概率为" + r);
    }
}