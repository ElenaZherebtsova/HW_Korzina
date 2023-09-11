package pro.sky.HWKorzina.Service;

import org.springframework.stereotype.Service;
import pro.sky.HWKorzina.DTO.Tovar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TovarServiceImpl implements TovarService {
    private Map<Integer, Tovar> storage;

    public TovarServiceImpl() {

        this.storage = new HashMap<>();
    }

    @Override
    public Tovar addTovar(int tovarID,
                          String tovarName) {
        Tovar newPosition = new Tovar(tovarID, tovarName);
        storage.put(tovarID, newPosition);
        return newPosition;
    }


    @Override
    public Collection<Tovar> printAll() {

        return storage.values();
    }


}
