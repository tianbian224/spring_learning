package e_use_anotation.auto_wired;

import org.springframework.stereotype.Component;

/**
 * @author cang.lv
 * @date 2018/8/1
 */
@Component("haha")
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("playing   music");
    }
}
