package pro.sky.HWKorzina.Service;

import org.springframework.stereotype.Service;
import pro.sky.HWKorzina.DTO.Tovar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class TovarServiceImpl implements TovarService {
    // Создаем мапу со списком товаров.
    private Map<Integer, Tovar> storage;

    // Объявляем тип -- HashMap.
    public TovarServiceImpl() {
        this.storage = new HashMap<>();
    }

    // Добавление товара.
    @Override
    public Tovar addTovar (int tovarID,
                           String tovarName,
                           double tovarPrice,
                           int tovarQuantity
                           ) {
        Tovar newPosition = new Tovar(tovarID, tovarName,
                tovarPrice, tovarQuantity);
        storage.put(tovarID, newPosition);
        return  newPosition;
    }

    // Выводим "значения" всех сотрудников из мапы.
    @Override
    public Collection<Tovar> printAll () {

        return storage.values();
    }


}
