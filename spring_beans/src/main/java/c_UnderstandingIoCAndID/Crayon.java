package c_UnderstandingIoCAndID;

public class Crayon implements Pen {

    @Override
    public void drawCircle() {
        System.out.println("Crayon  draw  circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("Crayon draw square ");
    }

    @Override
    public void drawTriangle() {
        System.out.println("Crayon  draw triangle");

    }

}
