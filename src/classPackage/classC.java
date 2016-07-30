package classPackage;

import classPackage.classB;

import java.util.Arrays;

public class classC extends classB {

    private int c;
    private Object args[];

    public classC(int a, int b, int c,String name,Object...args) {
        super(a, b, name);
        this.c = c;
        this.args=args;
    }

    public void classTest(){
        System.out.println("I'm on classPackage.classC");
    }

    public void showArgs(){
        System.out.println("Object name: "+name);
        System.out.println("Object "+name+" constructor arguments " +
                "of int type: ["+a+"], ["+b+"], ["+c+"]");
        System.out.print("Object "+name+" constructor arguments " +
                "of generic type Object: ");
        for (Object list:args) {
            System.out.print("["+list+"], ");
        }
        System.out.println();
        System.out.println("Number of constructor Object arguments:"+args.length);
    }

    @Override
    public String toString() {
        return name+"[{" +
                "a}=" + a +
                ", {b}=" + b +
                ", {c}=" + c +
                ", ObjectArgs=" + Arrays.toString(args) +
                '}';
    }
}
