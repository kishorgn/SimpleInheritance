package com.revature;

import com.revature.beans.A;
import com.revature.beans.B;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        A a = new A();
        B b = new B();

        System.out.println("With an instance of super class");
        a.meth1();

        System.out.println("With an instance of sub class");
        b.meth1();
        b.meth2();
    }
}
