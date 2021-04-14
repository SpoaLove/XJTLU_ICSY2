package cn.edu.xjtlu.cs170;

import java.util.Scanner;

public class Complex {
    private double real = 0.0;
    private double imag = 0.0;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex(double real) {
        this.real = real;
    }

    public Complex() { }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imag;
    }

    public Complex add(Complex other) {
        return new Complex(
                real + other.getRealPart(),
                imag + other.getImaginaryPart()
        );
    }

    public Complex subtract(Complex other) {
        return new Complex(
                real - other.getRealPart(),
                imag - other.getImaginaryPart()
        );
    }

    public Complex multiply(Complex other) {
        double c = other.getRealPart();
        double d = other.getImaginaryPart();
        return new Complex(
                real * c - imag * d,
                real * d + imag * c
        );
    }

    public Complex divide(Complex other) {
        double c = other.getRealPart();
        double d = other.getImaginaryPart();
        double denominator = c * c + d * d;
        return new Complex(
                ( real * c + imag * d ) / denominator,
                ( imag * c - real * d ) / denominator
        );
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        Complex c1 = new Complex(a, b);

        System.out.println("Enter the second complex number: ");
        double c = input.nextDouble();
        double d = input.nextDouble();
        Complex c2 = new Complex(c, d);

        System.out.println(c1.getRealPart());
        System.out.println(c1.getImaginaryPart());

        System.out.println("(" + c1 + ") + (" + c2 + ") = " + c1.add(c2));
        System.out.println("(" + c1 + ") - (" + c2 + ") = " + c1.subtract(c2));
        System.out.println("(" + c1 + ") * (" + c2 + ") = " + c1.multiply(c2));
        System.out.println("(" + c1 + ") / (" + c2 + ") = " + c1.divide(c2));
        System.out.println("|" + c1 + "| = " + c1.abs());

    }
}


