package org.fanlychie.service;

/**
 * Created by fanlychie on 2017/7/26.
 */
public class UserServiceImpl implements UserService {

    @Override
    public void register(String username, String password) {
        System.out.println("---------------------------------------------------------");
        System.out.println(String.format("接收到注册用户请求 - {username:%s, password:%s}",
                username, password));
        System.out.println("---------------------------------------------------------");
    }

}