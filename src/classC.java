public class classC extends classB{

    private int c;
    private String args[];

    public classC(int a, int b, int c,String...args) {
        super(a, b);
        this.c = c;
        this.args=args;
    }

    public void classTest(){
        System.out.println("I'm on classC");
    }

    public void showArgs(){
        for (String list:args) {
            System.out.println("Constructor String argument: ["+list+"]");
        }
        System.out.println("Number of constructor String arguments:"+args.length);
    }
}
