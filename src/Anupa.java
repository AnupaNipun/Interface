public interface Anupa {
    public abstract void sound ();
    public abstract void sleep ();

}
class Human implements Anupa{
    public void sound(){
        System.out.println("grr... grr...");
    }
    public void sleep(){
        System.out.println("suus... suus...");
    }
}
class Main {
    public static void main(String[] args){
        Human h = new Human();
        h.sleep();
        h.sound();
    }
}