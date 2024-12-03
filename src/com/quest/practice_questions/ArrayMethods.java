package com.quest.practice_questions;
import java.util.Scanner;
public class ArrayMethods {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int numberOfElements=sc.nextInt();
        int[] searchArray = new int[numberOfElements];
        int searchValue = 0; // to store the element to search
        System.out.println("enter the elements");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("enter the element for position"+i);
            searchArray[i] = sc.nextInt();
        }
        System.out.println("enter the element to search");
        searchValue = sc.nextInt();
        int pos=linearSearch(searchArray, searchValue); // calling the method to search for an element in the array
        if (pos == -1) {
            System.out.println("the element is not found");
        }
        else {
            System.out.println("the element is found at position "+pos);
        }
        sortArray(searchArray); // calling the method for sorting the array
        printArray(searchArray); // calling the method to print array
    }
    // method to search for an element
    private static int  linearSearch(int[] searchArray,int searchVariable){
        int position = 0; // to store the position of element to search
        int flag = 0; // to indicate whether element found or not
        for (int i = 0; i < searchArray.length; i++) {
            if(searchArray[i] == searchVariable){
                position=i;
                flag=1;
            }
        }
        if (flag==1){
            return position;
        }else{
            return -1;
        }
    }
    // method to sort the array
    private static int[] sortArray(int[] searchArray) {
        // selection sort
        for (int i = 0; i < searchArray.length; i++) {
            for (int j = i + 1; j < searchArray.length; j++) {
                if (searchArray[i] > searchArray[j]) {
                    int temp = searchArray[i];
                    searchArray[i] = searchArray[j];
                    searchArray[j] = temp;
                }
            }
        }
        return searchArray;
    }
    // method to print the sorted array
    private static void printArray(int[] searchArray) {
        for(int i:searchArray){
            System.out.print(i+" ");
        }
    }
}
