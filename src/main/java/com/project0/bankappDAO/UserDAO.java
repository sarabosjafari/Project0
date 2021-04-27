package com.project0.bankappDAO;

import java.sql.SQLException;
import com.project0.bankappDAO.BusinessException;
import com.project0.bankapp.User;

public interface UserDAO {
    public User createUser(User user) throws SQLException, BusinessException;
}
