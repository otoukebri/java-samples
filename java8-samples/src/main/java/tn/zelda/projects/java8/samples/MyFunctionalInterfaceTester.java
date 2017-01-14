package tn.zelda.projects.java8.samples;

public class MyFunctionalInterfaceTester {

    public static void main(String[] args) {
        MyFunctionalInterface m = new MyFunctionalInterface() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
    }

}
