package com.project0.bankappDAO;

import java.sql.SQLException;
import com.project0.bankappDAO.BusinessException;
import com.project0.bankapp.Account;

public interface AccountDAO {

    public AccountDAO createAccount(AccountDAO account) throws SQLException, BusinessException;
}

