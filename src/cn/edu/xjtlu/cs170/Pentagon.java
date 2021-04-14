package cn.edu.xjtlu.cs170;


abstract class GeometricObject implements Comparable<GeometricObject> {
    // a.abstract method getArea()
    double getArea() {
        return 0;
    }

    // a.abstract method getPerimeter()
    int getPerimeter() {
        return 0;
    }
}


public class Pentagon extends GeometricObject {

    // data field named side with default value 1
    private int side = 1;

    public int getSide() {
        return side;
    }

    // d. no arg constructor
    public Pentagon() {}

    // e. constructor with specified side
    public Pentagon(int side) {
        this.side = side;
    }

    // f. method getArea() that returns the area
    // equation of area given side length is (5/(4*sqrt(5-2*sqrt(5)))) * side^2
    @Override
    public double getArea() {
        return (5.0 * side * side) / (4.0*Math.sqrt(5.0-2*Math.sqrt(5)));
    }

    // g. method getPerimeter() that returns the perimeter
    // equation of perimeter given side length is 5*side
    @Override
    public int getPerimeter() {
        return side * 5;
    }

    // h. method max(Pentagon a, Pentagon b) that returns the pentagon with larger perimeter
    public static Pentagon max(Pentagon a, Pentagon b) {
        return a.getPerimeter() >= b.getPerimeter() ? a : b;
    }

    // i. override equals method to check if their area is same
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pentagon)) return false;
        Pentagon pentagon = (Pentagon) o;
        return getArea() == pentagon.getArea();
    }

    // j. override compareTo method based on their area
    @Override
    public int compareTo(GeometricObject o) {
        if      (getArea() < o.getArea()) return -1;
        else if (getArea() > o.getArea()) return  1;
        else                              return  0;
    }
}
