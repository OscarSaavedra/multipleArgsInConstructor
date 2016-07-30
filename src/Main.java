import classPackage.classC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("We are going to create an object C of the classPackage.classC");
        System.out.println("================================================");
        System.out.println("Put object name");
        String name=sc.next();
        System.out.println("Put argument 1 (int)");
        int arg1=sc.nextInt();
        System.out.println("Put argument 2 (int)");
        int arg2=sc.nextInt();
        System.out.println("Put argument 3 (int)");
        int arg3=sc.nextInt();

        ArrayList<String> argumentList=new ArrayList<>();
        int contForTable=0;
        boolean stop=false;

        while (!stop){
            System.out.println("Write all String arguments you want to pass the constructor " +
                    "(put an X to stop and finish)");
            String write=sc.next();
            if (!write.equals("X")){
                argumentList.add(write);
            }else{
                stop=true;
            }
        }
        String tableOfArgs[]=new String[argumentList.size()];
        for (String argsForTable:argumentList) {
            tableOfArgs[contForTable]=argsForTable;
            contForTable++;
        }
        classC objC=new classC(arg1,arg2,arg3,name,tableOfArgs);
        objC.showArgs();

        System.out.println("=============================");

        classC objC2=new classC(3,4,5,"objC2","test");
        objC2.showArgs();

        System.out.println("=============================");

        System.out.println("Now putting objC2 as an argument for objC3");
        classC objC3=new classC(1,2,4,"objC3",objC2);
        objC3.showArgs();
        System.out.println("Using toString");
        System.out.println(objC3.toString());
    }
}
