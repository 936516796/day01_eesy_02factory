package com.qf.dao.impl;

import com.qf.dao.IAccountDao;

/**
 * @author 甘若飞
 * @date
 *
 * 账户的持久层实现类
 *
 */
public class AccountDaoImpl implements IAccountDao {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
