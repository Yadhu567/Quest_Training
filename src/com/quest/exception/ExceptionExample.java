package com.quest.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            int result=num1/num2;
            System.out.println("the result is "+result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic exception occurred! cannot divide by zero");
        }catch(InputMismatchException e){
            System.out.println("InputMismatch exception occurred! enter an integer value");
        }finally{
            System.out.println("this is an example of exception");
        }
        arrayElementAcess();
    }
    public static void arrayElementAcess(){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,4,8,2,1};
        int[] arr2=null;
        try {
            System.out.println("enter the index to access the element");
            int index=sc.nextInt();
            System.out.println("enter 1 to acess the element from first array or 0 for second array");
            int choice=sc.nextInt();
            int element=-1;
            if(choice==1){
                element = arr[index];
            }else{
                element = arr2[index];
            }
            System.out.println("the element at index "+index+" is: "+element);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred! enter an index less than 5");
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException occurred! enter an integer value");
        }catch (NullPointerException e){
            System.out.println("NullPointerException occurred! cannot access a null value");
        }finally {
            System.out.println("this is another example of exception");
        }

    }
}
