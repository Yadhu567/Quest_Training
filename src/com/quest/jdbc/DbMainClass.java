package com.quest.jdbc;

public class DbMainClass {
    public static void main(String[] args) {
        DbServices  dbServices=new MySqlDbService();

//        dbServices.createDatabase();
//
//        dbServices.createTable();
//
//        dbServices.insertDataToTable();

        dbServices.selectDataFromTable();

//        dbServices.updateDataFromTable();
//
//        dbServices.deleteDataFromTable();
    }
}
