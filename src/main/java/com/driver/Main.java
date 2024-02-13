package com.driver;

       class A {
         String meth() {
             return "Invoking method from class A";
         }
       }
       class B extends A {
             String meth() {
                 return "Method is overridden in Extendend class B";
             }


             public static void main(String args[]) {
                 B obj1 = new B();
                 System.out.print(obj1.meth());

                 B obj2 = new B();
                 System.out.print(obj2.meth());
             }
       }









