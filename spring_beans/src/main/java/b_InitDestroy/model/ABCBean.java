package b_InitDestroy.model;

public class ABCBean {
    public ABCBean() {
        System.out.println("ABCBean gouzao  hanshu ");
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println(" destroy");
    }

    public void ccd() {
        System.out.println("instance ccd");
    }
}
