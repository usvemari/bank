package com.banka.paraProjesi;

import java.sql.*;

public class databaseController {
    public static void main(String[] args){

        String url="jdbc:mysql://localhost:3306/bankappdb";
        String user="root";
        String password="apex1234";

        try{
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Bağlantı oke gang");

            Statement tryStatement=con.createStatement();
            ResultSet rs=tryStatement.executeQuery("SELECT * FROM USERS");

            try {
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("userID") + " - " +
                                    rs.getString("userName")
                    );
                }
            }catch (Exception e){
                System.out.println("hata");
            }


            rs.close();
            tryStatement.close();
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        catch (Exception e) {
            System.out.println("HATA: " + e.getMessage());
            e.printStackTrace();
        }


    }

}
