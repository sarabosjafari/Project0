package com.project0.bankappDAO;

import java.sql.SQLException;
import com.project0.bankappDAO.BusinessException;
import com.project0.bankapp.Transaction;


public interface TransactionDAO {
    public Transaction createTransaction (Transaction transactions) throws SQLException, BusinessException;
}
