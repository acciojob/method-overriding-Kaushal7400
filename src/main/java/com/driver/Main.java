package com.driver;
public class Main {
    public static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }


        public static void main(String args[]) {
            B obj1 = new B();
            System.out.println(obj1.meth());

            B obj2 = new B();
            System.out.println(obj2.meth());
        }

}









