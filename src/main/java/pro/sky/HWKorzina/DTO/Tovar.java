package pro.sky.HWKorzina.DTO;

import java.util.Objects;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

@Repository
@SessionScope
public class Tovar {
    private int tovarID;
    private String tovarName;

    public Tovar(int tovarID, String tovarName) {
        this.tovarID = tovarID;
        this.tovarName = tovarName;
           }


}
