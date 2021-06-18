interface inf1 {
    void show();

    default void display() {
        System.out.println("display in inf1");

    }

    static void print1() {
        System.out.println("println static method ");
    }
}
class myinterface implements  inf1 {
    public void show(){
        System.out.println("show in class");
    }
    public void display(){
        System.out.println("display in class ");
    }
    public static void main(String args[]){
        myinterface p=new myinterface();
        p.show();
        inf1.print1();

        p.display();
    }
}
