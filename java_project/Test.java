public class Test{
    public static void main(String [] args){
        System.out.println("Jay Shree Ram !");
        printSystemProperties();
    }

    public static void printSystemProperties(){
        System.out.println("Printing system properties");
        System.out.println(System.getProperties());
    }
}