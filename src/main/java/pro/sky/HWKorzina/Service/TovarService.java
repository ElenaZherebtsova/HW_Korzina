package pro.sky.HWKorzina.Service;

import pro.sky.HWKorzina.DTO.Tovar;

import java.util.Collection;

public interface TovarService {

    Tovar addTovar(int tovarID, String tovarName);

    Collection<Tovar> printAll();

}
