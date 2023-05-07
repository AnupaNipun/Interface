public interface Area1 {
    public abstract void getArea1(final int length, final int width);
}
class Rectangle implements Area1 {
    public void getArea1(int length, int width){
        System.out.println(length * width);
    }
}
class Run{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea1(8, 6);
    }
}