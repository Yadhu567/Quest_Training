package com.quest.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDbService extends DbServices{
    @Override
    void createDatabase() {
        String createSchemaQuery="CREATE SCHEMA quest_schema";
        Connection con=null;
        Statement stat=null;
        try{
            con=MySqlConnection.getConnection();
            stat=con.createStatement();
            stat.executeUpdate(createSchemaQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(stat!=null){
               try{
                   stat.close();
               }catch (Exception e){
                   e.printStackTrace();
               }
            }
            if(con!=null){
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    void createTable() {

        String createTableQuery="CREATE TABLE Student(ID int primary key auto_increment,name varchar(50),dept varchar(30))";
        Connection con=null;
        Statement stmt=null;
        try{
            con=MySqlConnection.getConnection();
            stmt=con.createStatement();
            stmt.executeUpdate(createTableQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
               try{
                   stmt.close();
               }catch (Exception e){
                   e.printStackTrace();
               }
            }
            if(con!=null){
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    void insertDataToTable() {

        String insertDataQuery="Insert into Student(name,dept) values('peter','CSE'),('ron','ME')";
        Connection con=null;
        Statement stmt=null;
        try{
            con=MySqlConnection.getConnection();
            stmt=con.createStatement();
            stmt.executeUpdate(insertDataQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(con!=null){
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    void selectDataFromTable() {

        String selectDataQuery="SELECT * from Student";
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            con=MySqlConnection.getConnection();
            stmt=con.createStatement();
            rs=stmt.executeQuery(selectDataQuery);
            while (rs.next()){
                int id=rs.getInt("ID");
                String name=rs.getString("name");
                String dept=rs.getString("dept");

                System.out.println("student");
                System.out.println("id: "+id+" name: "+name+" department: "+dept);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(con!=null){
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    void updateDataFromTable() {

        String updateDataQuery="UPDATE Student SET dept='EEE' where name='peter'";
        Connection con=null;
        Statement stmt=null;
        try{
            con=MySqlConnection.getConnection();
            stmt=con.createStatement();
            stmt.executeUpdate(updateDataQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(con!=null){
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    void deleteDataFromTable() {
        String deleteDataQuery="DELETE FROM Student WHERE name='peter'";
        Connection con=null;
        Statement stmt=null;
        try{
            con=MySqlConnection.getConnection();
            stmt=con.createStatement();
            stmt.executeUpdate(deleteDataQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try{
                    stmt.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(con!=null){
                try{
                    con.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
