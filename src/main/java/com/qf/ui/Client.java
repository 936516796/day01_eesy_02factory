package com.qf.ui;

import com.qf.dao.IAccountDao;
import com.qf.service.IAccountService;
import com.qf.service.impl.AccountServiceImpl;

/**
 * @author 甘若飞
 * @date
 *
 * 模拟一个表现层,用于调用业务层
 */
public class Client {

    public static void main(String[] args) {
        IAccountService as = new AccountServiceImpl();
        as.saveAccount();
    }
}
