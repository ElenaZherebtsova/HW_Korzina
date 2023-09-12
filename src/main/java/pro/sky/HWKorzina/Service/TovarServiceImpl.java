package pro.sky.HWKorzina.Service;

import org.springframework.stereotype.Service;
import pro.sky.HWKorzina.DTO.Tovar;

import java.util.List;

@Service
public class TovarServiceImpl implements TovarService {

    private final Tovar tovar;

    public TovarServiceImpl(Tovar tovar) {
        this.tovar = tovar;
    }

    @Override
    public void addTovar(List<Long> items) {
        items.forEach(it -> tovar.add(it));
    }

    @Override
    public List<Long> getTovar() {
        return tovar.get();
    }
}


