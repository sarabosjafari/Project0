package com.project0.bankappDAO;

import java.util.List;
import com.project0.bankapp.User;

public interface LoginDAO {

    public User getUserByNameAndPassword(String name, String password) throws BusinessException;



}
