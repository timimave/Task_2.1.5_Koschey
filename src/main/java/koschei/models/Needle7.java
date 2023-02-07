package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    public Needle7(Deth8 deth8) {
        this.deth = deth8;
    }

    private final Deth8 deth;

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }
}
