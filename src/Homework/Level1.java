package Homework;

import java.util.Scanner;
public class Level1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        String z = "no";
        int a;
        int b;
        int c;
        while(true) {
            System.out.println("欢迎亲爱的同学来测期末成绩qwq（成绩范围0~100）。");
            while (true) {
                System.out.println("请输入您的平时成绩：");
                a = sc.nextInt();
                System.out.println("您的平时成绩为：" + a);
                if(a<0|a>100){
                    System.out.println("请输入正确值！");
                }else {
                    System.out.println("请确认：1、是的（yes）。2、打错了重来（no）。");
                    String x = st.nextLine();
                    System.out.println(x);
                    boolean d = x.equals(z);
                    if (d) {
                        System.out.println("搞啥呢小伙汁，成绩都能弄错？");
                    } else {
                        break;
                    }
                }
            }
            while (true) {
                System.out.println("请输入您的期中成绩：");
                b = sc.nextInt();
                System.out.println("您的期中成绩为：" + b);
                if(b<0|b>100){
                    System.out.println("请输入正确值！");
                }else {
                    System.out.println("请确认：1、是的（yes）。2、打错了重来（no）。");
                    String x = st.nextLine();
                    System.out.println(x);
                    boolean d = x.equals(z);
                    if (d) {
                        System.out.println("搞啥呢小伙汁，成绩都能弄错？");
                    } else {
                        break;
                    }
                }
            }
            while (true) {
                System.out.println("请输入您的期末成绩：");
                c = sc.nextInt();
                System.out.println("您的期末成绩为：" + c);
                if(c<0|c>100){
                    System.out.println("请输入正确值！");
                }else {
                    System.out.println("请确认：1、是的（yes）。2、打错了重来（no）。");
                    String x = st.nextLine();
                    System.out.println(x);
                    boolean d = x.equals(z);
                    if (d) {
                        System.out.println("搞啥呢小伙汁，成绩都能弄错？");
                    } else {
                        break;
                    }
                }
            }
            double r = 0.2 * a + 0.3 * b + 0.5 * c;
            System.out.println("您的最终成绩是：" + r);
            if (r < 60) {
                System.out.println("勇敢俊枭，不怕困难！");
            } else if (r > 60) {
                System.out.println("就这，还没我卷");
            }
            System.out.println("是否再玩一次？");
            String x = st.nextLine();
            System.out.println(x);
            boolean d = x.equals(z);
            if (d) {
                System.out.println("感谢游玩qwq");
                break;
            }
        }
    }
}