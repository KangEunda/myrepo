package com.j1.w6.Calc_01;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    int a;
    int b;
    char c;
    
    System.out.println("input first number");
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    System.out.println("a = "+a);
    
    System.out.println("input second number");
    Scanner sc = new Scanner(System.in);
    b = sc.nextInt();
    System.out.println("b = "+b);
    
    System.out.println("input an operator");
    Scanner scanner = new Scanner(System.in);
    c = scanner.next().charAt(0);
    
    if(c!='+' && c!='-' && c!='*' && c!='/') {
     System.out.println("wrong operator");
    }else {
     System.out.print(a+"" + c + "" + b + "=");
     switch(c){
     case '+' : System.out.print((a+b));
     break;
     case '-' : System.out.print((a-b));
     break;
     case '*' : System.out.print((a*b));
     break;
     case '/' : System.out.print((double)a/b);
     }
    }
  }
}