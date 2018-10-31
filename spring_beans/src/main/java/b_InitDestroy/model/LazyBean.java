package b_InitDestroy.model;

public class LazyBean {
    public LazyBean() {
        System.out.println(" ==== lazy  bean  constructer ");
    }


    public void ccd() {
        System.out.println("instance ccd");
    }
}
