package Homework;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        String[][] students = new String[10][2];
        while (true) {
            System.out.println("请选择（输入选项代码）：1、录入\t2、修改\t3、删除\t4、打印");
            int x = sc.nextInt();
            if (x == 1) {
                for (int i = 0; i < 10; i++) {
                    if (students[i][0] == null && students[i][1] == null) {
                        System.out.println("请输入学号：");
                        students[i][0] = sa.nextLine();
                        System.out.println("请输入姓名：");
                        students[i][1] = sb.nextLine();
                        System.out.println(students[i][0] + "\t" + students[i][1]);
                    }
                    System.out.println("是否输入下一个：1、yes\t2:、no");
                    x = sc.nextInt();
                    if (x == 2) {
                        break;
                    }
                }
            } else if (x == 2) {
                do {
                    for (int l = 0; l < 10; l++) {
                        if (students[l][0]!=null&&students[l][1]!=null) {
                            System.out.println(students[l][0] + "\t" + students[l][1]);
                        }
                    }
                    System.out.println("请选择您想要修改的信息：\t1、学号\t2、姓名");
                    x = sc.nextInt();
                    if (x == 1) {
                        System.out.println("请输入需要修改者的姓名：");
                        String name = sd.nextLine();
                        for (int f = 0; f < 10; f++) {
                            if (name.equals(students[f][1])) {
                                System.out.println("请输入修改后的学号：");
                                name = sd.nextLine();
                                students[f][0] = name;
                                System.out.println("修改后：" + students[f][0] + "\t" + students[f][1]);
                            }
                        }
                    } else {
                        System.out.println("请输入需要修改者的学号：");
                        String name = sd.nextLine();
                        for (int f = 0; f < 10; f++) {
                            if (name.equals(students[f][0])) {
                                System.out.println("请输入修改后的姓名：");
                                name = sd.nextLine();
                                students[f][1] = name;
                                System.out.println("修改后：" + students[f][0] + "\t" + students[f][1]);
                            }
                        }
                    }
                    System.out.println("是否继续修改：\t1、是\t2、否");
                    x = sc.nextInt();
                } while (x != 2);
            } else if (x == 3) {
                for (int l = 0; l < 10; l++) {
                    if (students[l][0]!=null&&students[l][1]!=null) {
                        System.out.println(students[l][0] + "\t" + students[l][1]);
                    }
                }
                System.out.println("请输入需要删除的内容：");
                String name = sd.nextLine();
                for (int f = 0; f < 10; f++) {
                    if (name.equals(students[f][0]) || name.equals(students[f][1])) {
                        students[f][0] = "0";
                        students[f][1] = "0";
                    }
                }
            } else {
                int j = 0;
                do {
                    if (students[j][0] == null) {
                        students[j][0] = "0";
                    }
                    j++;
                } while (j < 10);
                int m = 0;
                do {
                    int k = 0;
                    do {
                        int b = Integer.parseInt(students[k][0]);
                        int c = Integer.parseInt(students[k + 1][0]);
                        if (b > c) {
                            String[][] a = new String[1][2];
                            a[0][0] = students[k][0];
                            a[0][1] = students[k][1];
                            students[k][0] = students[k + 1][0];
                            students[k][1] = students[k + 1][1];
                            students[k + 1][0] = a[0][0];
                            students[k + 1][1] = a[0][1];
                        }
                        k++;
                    } while (k < 9);
                    m++;
                } while (m < 9);
                for (int l = 0; l < 10; l++) {
                    if (!"0".equals(students[l][0])) {
                        System.out.println(students[l][0] + "\t" + students[l][1]);
                    }
                }
            }
            System.out.println("是否继续使用？\t1yes\t2、no");
            x = sc.nextInt();
            if (x == 2) {
                break;
            }
        }
    }
}