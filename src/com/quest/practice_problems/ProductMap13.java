package com.quest.practice_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductMap13 {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap=new HashMap<>();

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter product name");
            String product=sc.nextLine();
            System.out.println("enter the price");
            double price=sc.nextInt();
            hashMap.put(product,price);
            sc.nextLine();
        }

        System.out.println("enter the product to update price");
        String updateProduct=sc.nextLine();
        System.out.println("enter the updated price");
        double updatePrice=sc.nextDouble();

        if(hashMap.containsKey(updateProduct)){
            hashMap.put(updateProduct,updatePrice);
        }else{
            System.out.println("product not found");
        }

        Map.Entry<String,Double> maxE=null;
        for (Map.Entry<String, Double> entry : hashMap.entrySet()) {
            if (maxE == null || entry.getValue() > maxE.getValue()) {
                maxE = entry;
            }
        }
        if(maxE==null){
            System.out.println("No product available");
        }else{
           System.out.println("Product with the highest price "+maxE.getKey()+" : "+maxE.getValue());

        }

    }
}
