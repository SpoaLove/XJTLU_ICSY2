package cn.edu.xjtlu.cpt105.week7;


class Parent{
    private int val;
    Parent (int val) {
        this.val=val;
    }
}

class Child extends Parent {
    Child(int val) {
        super(val);
        System.out.println();
    }
}


public class Example {

}
