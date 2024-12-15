package com.quest.casestudies;

import java.util.*;

public class ProductMainClass {
    public static void main(String[] args) {
        List<Product> products= Arrays.asList(new Product(23,"Laptop",344,44),
                new Product(23,"Keyboard",344,13),
                new Product(23,"Monitor",434,14));

        double totalPrice=products.stream().map(p->p.getPrice()*p.getQuantity()).reduce(0.0,Double::sum);

        System.out.println(totalPrice);
        List<Product> topProducts=products.stream().max(Comparator.comparingDouble(Product::getPrice).reversed()).stream().limit(3).toList();
        System.out.println(topProducts);
        System.out.println();
        Map<String,Double> productMap=new HashMap<>();

        for(Product p: products){
            productMap.put(p.getName(),p.getPrice());
        }
        System.out.println(productMap);
    }
}
