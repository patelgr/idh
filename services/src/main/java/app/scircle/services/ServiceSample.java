package app.scircle.services;

import app.scircle.domain.DomainSample;

public class ServiceSample {
    public  void test() {
        System.out.println("Hello From Service Sample");
        new DomainSample().test();
    }
}
