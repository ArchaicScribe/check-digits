package edu.cnm.deepdive;

import java.util.Scanner;

public class Check {

  public static int digitSum(int airth) {
    String b;
    int c = 0;

    b = Integer.toString(airth);
    for (int i = 0; i < b.length(); i++) {
      c += b.charAt(i) - 48;
    }
  return c;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter a new number: ");
    int a = scanner.nextInt();
    System.out.println(digitSum(a));
    System.out.println(digitSum(a) / 9);
    System.out.println(a);
    System.out.println(digitSum(a) / 9);
  }


}
