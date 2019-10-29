package com.qf.service.impl;

import com.qf.dao.IAccountDao;
import com.qf.service.IAccountService;

/**
 * @author 甘若飞
 * @date
 *
 *  账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
