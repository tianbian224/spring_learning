package c_UnderstandingIoCAndID;

public class Pencil implements Pen
{
    @Override
    public void drawCircle() {
        System.out.println("Pencil  draw  circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("Pencil draw square ");
    }

    @Override
    public void drawTriangle() {
        System.out.println("Pencil  draw triangle");

    }

}
