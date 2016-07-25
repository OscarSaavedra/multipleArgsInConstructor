import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("We are going to create an object C of the classC");
        System.out.println("================================================");
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
        classC objC2=new classC(arg1,arg2,arg3,tableOfArgs);
        objC2.showArgs();

        System.out.println("=============================");

        classC objC3=new classC(3,4,5,"argument");
        objC3.showArgs();
    }
}
