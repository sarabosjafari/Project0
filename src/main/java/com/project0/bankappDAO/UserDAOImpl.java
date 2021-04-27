package com.project0.bankappDAO;

import java.sql.*;


import com.project0.bankapp.User;

public class UserDAOImpl implements UserDAO {

    public User createUser(User user) throws BusinessException {

        try(Connection connection = PostgresConnection.getConnection()) {
            String sql="INSERT INTO bank_app.users\n" +
                    "(\"Name\", Password, AccountID)\n" +
                    "VALUES(?, ?, ?);\n";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);){
                preparedStatement.setString(1,user.getName());
                preparedStatement.setInt(2,user.getAccountID());
                preparedStatement.setString(3,user.getPassword());

                int c=preparedStatement.executeUpdate();
                if(c==1){
                    ResultSet resultSet=preparedStatement.getGeneratedKeys();
                    if(resultSet.next()){
                        user.setName(resultSet.getString(1));
                    }
                }else {
                    throw new BusinessException("Failure in registration... Please retry.....");
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        return user;
    }


    }

