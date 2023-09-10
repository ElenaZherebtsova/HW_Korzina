package pro.sky.HWKorzina.Service;

import pro.sky.HWKorzina.DTO.Tovar;

import java.util.Collection;

public interface TovarService {
    // Метод, который добавляет товар в корзину.
    Tovar addTovar(int tovarID,
                   String tovarName,
                   double tovarPrice,
                   int tovarQuantity);

    Collection<Tovar> printAll();

}
