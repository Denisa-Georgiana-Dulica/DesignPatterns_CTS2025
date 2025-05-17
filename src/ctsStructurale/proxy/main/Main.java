package ctsStructurale.proxy.main;

import ctsStructurale.proxy.classes.AbstractLogin;
import ctsStructurale.proxy.classes.Login;
import ctsStructurale.proxy.classes.ProxyLogin;

public class Main {
    public static void main(String[] args) {
        AbstractLogin login=new Login("admin","admin");
        ProxyLogin proxyLogin=new ProxyLogin(login);
        proxyLogin.login("admin","a");
        proxyLogin.login("admin","admin");
        proxyLogin.login("admin","a");
        proxyLogin.login("admin","a");

    }
}
