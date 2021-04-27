package com.project0.bankappDAO;


import com.project0.bankapp.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class LoginDAOImp implements LoginDAO {
    public LoginDAOImp() {
    }

    public User getUserByNameAndPassword(String name, String password) throws BusinessException {
       //LoginDAOImp user=new LoginDAO;
        User user=new User();
        try(Connection connection= PostgresConnection.getConnection()){
            String sql="select users.name,users.password from bank_app.users where users.name=? and users.password=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,password);

            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){

                user.setName(resultSet.getString("Name"));
                user.setPassword(resultSet.getString("Password"));


            }else{
                throw new BusinessException("No user found with Name:"+name);
            }
        } catch (SQLException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact sysadmin");
        }
        return user;
    }

    private void setAccountID(int accountID) {
    }

    private void setPassword(String password) {
    }

    private void setName(String name) {
    }


    }

