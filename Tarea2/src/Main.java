public class Main {
    public static void main (String[]args){
        Canvas c = new Canvas(7, 7);
        c.draw(1, 1, 5, 4);
        System.out.println(c.drawCanvas());
    }
}
