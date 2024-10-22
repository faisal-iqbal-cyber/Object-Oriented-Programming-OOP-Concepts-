abstract class animal{
    abstract void walk();
    public void eats(){
        System.out.println("als0 eat");
    }
    public void sleep(){
        System.out.println("also sleep");

}
}
class Horse extends animal{
public void walk(){
    System.out.println("Walk on four legs");
}
}
class chicken extends Horse{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}


    public class Abstraction {
    public static void main(String args[]){
       Horse h=new Horse();
       h.walk();
       h. eats();
       h.sleep();
       
    }
}
       
    