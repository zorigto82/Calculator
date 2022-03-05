package com.company.Lyamda;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);// 3
        int b = calc.minus.apply(1,1);// 0
        int c = calc.devide.apply(a, b); // 3/0  на ноль делить нельзя!
        int d = calc.multiply.apply(a, b);

        //int f = calc.pow.apply(a);
        //int g = calc.abs.apply(a);
        //boolean h = calc.isPositive.test(a);

        calc.println.accept(c);

    }
}