package com.quest.booksinventory;

public class SpecialEditionBook extends Book{
    private final String specialFeatures; //to store special features
    public SpecialEditionBook(String title, String author, double price, int stock,String specialFeatures) {
        super(title, author, price, stock);
        this.specialFeatures=specialFeatures;
    }

    //overrides toString method
    @Override
    public String toString() {
        return "SpecialEditionBook{"+super.toString()+
                "specialFeatures='" + specialFeatures + '\'' +
                '}';
    }
}
