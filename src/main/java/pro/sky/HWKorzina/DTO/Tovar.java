package pro.sky.HWKorzina.DTO;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Tovar {
    private List<Long> tovarID = new ArrayList<>();

    public void add(Long id) {
        tovarID.add(id);
    }

    public List<Long> get() {
        return Collections.unmodifiableList(tovarID);
    }


}
