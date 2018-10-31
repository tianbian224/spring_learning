package e_use_anotation.java_wired.outerJavaClass;

public class Computer {

    public Computer(Mouse mouse) {
        this.mouse = mouse;
    }

    private Mouse mouse;

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
