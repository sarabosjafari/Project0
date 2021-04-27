package com.project0.bankappDAO;

import java.sql.*;
import com.project0.bankapp.Account;

public class AccountImplDAO implements AccountDAO {

    public Account createAccount(Account account) throws BusinessException {

        try(Connection connection = PostgresConnection.getConnection()) {
            String sql="INSERT INTO bank_app.account\n" +
                    "(\"Name\", AccountID, Balance)\n" +
                    "VALUES(?, ?, ?);\n";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);){
                preparedStatement.setString(1,account.getName());
                preparedStatement.setInt(2,account.getAccountID());
                preparedStatement.setDouble(3,account.getBalance());

                int c=preparedStatement.executeUpdate();
                if(c==1){
                    ResultSet resultSet=preparedStatement.getGeneratedKeys();
                    if(resultSet.next()){
                        account.setName(resultSet.getString(1));
                    }
                }else {
                    throw new BusinessException("Failure in registration... Please retry.....");
                }
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        return account;
    }

    @Override
    public AccountDAO createAccount(AccountDAO account) throws SQLException, BusinessException {
        return null;
    }
}
