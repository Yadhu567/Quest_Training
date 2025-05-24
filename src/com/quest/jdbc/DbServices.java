package com.quest.jdbc;

public abstract class DbServices {
    abstract void createDatabase();
    abstract void createTable();
    abstract void insertDataToTable();
    abstract void selectDataFromTable();
    abstract void updateDataFromTable();
    abstract void deleteDataFromTable();
}
