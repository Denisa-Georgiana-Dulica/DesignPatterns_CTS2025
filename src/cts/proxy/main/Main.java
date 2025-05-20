package cts.proxy.main;

import cts.proxy.classes.Internare;
import cts.proxy.classes.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        ProxyInternare proxyInternare=new ProxyInternare(new Internare(false));
        proxyInternare.internare();
    }
}
