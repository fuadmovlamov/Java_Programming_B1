package day26_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(45);
        Picture.draw("Black", "White");


        int num = 6;
        String str = "Test";
        Picture.draw(str, num);
        Picture.draw(num, str);
    }

}
