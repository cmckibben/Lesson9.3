package org.example;

class A extends B {
    public void method2() {
        System.out.println("a 2");
    }
}

class D extends B {
    public void method1() {
        System.out.println("d 1");
    }
}

class C {
    public String toString() {
        return "c";
    }

    public void method1() {
        System.out.println("c 1");
    }

    public void method2() {
        System.out.println("c 2");
    }
}

class B extends C {
    public String toString() {
        return "b";
    }

    public void method2() {
        System.out.println("b 2");
    }
}

class Main {
  public static void main(String[] args) {
    C[] elements = {new A(),
                    new B(),
                    new C(),
                    new D()};
    for (int i = 0; i < elements.length; i++) {
        System.out.println(elements[i]);
        elements[i].method1();
        elements[i].method2();
    }
  }
}