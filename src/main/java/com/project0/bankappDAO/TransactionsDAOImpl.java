package com.project0.bankappDAO;

import java.sql.*;

import com.project0.bankapp.Transaction;

public class TransactionsDAOImpl implements TransactionDAO{

    @Override
    public Transaction createTransaction(Transaction transaction) throws SQLException, BusinessException {
        try(Connection connection = PostgresConnection.getConnection()) {
            String sql = "INSERT INTO bank_app.transactions\n" +
                    "(transactionsID, AccountID, Amount)\n" +
                    "VALUES(?, ?, ?);\n";
            try(PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                preparedStatement.setDouble(1, transaction.getTransactionID());
                preparedStatement.setDouble(2, transaction.getAccountID());
                preparedStatement.setDouble(3, transaction.getAmount());

                int c = preparedStatement.executeUpdate();
                if (c == 1) {
                    ResultSet resultSet = preparedStatement.getGeneratedKeys();
                    if (resultSet.next()) {
                        transaction.setTransactionID(resultSet.getInt(1));
                    }
                } else {
                    throw new BusinessException("Failure in registration... Please retry.....");
                }
            }
        }


        return transaction;
    }
}
