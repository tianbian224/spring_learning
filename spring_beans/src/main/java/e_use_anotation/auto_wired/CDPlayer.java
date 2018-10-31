package e_use_anotation.auto_wired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cang.lv
 * @date 2018/8/1
 */
@Component
public class CDPlayer {
    private   CompactDisc disc;

    @Autowired
    public CDPlayer(CompactDisc heihei) {
        this.disc = heihei;
    }

    public CompactDisc getDisc() {
        return disc;
    }
}
