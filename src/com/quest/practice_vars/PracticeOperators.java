package com.quest.practice_vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
//      Arithematic operators
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);
//      Relational operators
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        boolean x= true;
        boolean y= false;

//      logical operator
        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(x!=y);

        int z=10;
        z+=5;  //z=z+5
//      unary operator
        System.out.println(z);
        System.out.println(z++);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z--);

        int p=10;
        int q=5;
//      ternary operator
        int result = p>=15 ? q++ : 0;
        System.out.println(result);
    }
}
