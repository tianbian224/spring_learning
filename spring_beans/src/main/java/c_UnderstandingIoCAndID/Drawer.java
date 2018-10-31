package c_UnderstandingIoCAndID;

public class Drawer {
    private Pen pen;

    public void setPen(Pen pen) {
        this.pen = pen;
    }


    public void drawMouse() {
        pen.drawTriangle();
        pen.drawSquare();
    }

    public void drawPhone() {
        pen.drawSquare();
        pen.drawSquare();
    }

    public void drawCup() {
        pen.drawCircle();
        pen.drawSquare();
    }
}
