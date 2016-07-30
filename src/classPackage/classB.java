package classPackage;

import classPackage.classA;

public class classB extends classA {

    protected int b;

    public classB(int a, int b,String name) {
        super(a,name);
        this.b = b;
    }

    void classTest(){
        System.out.println("I'm on classPackage.classB");
    }
}

