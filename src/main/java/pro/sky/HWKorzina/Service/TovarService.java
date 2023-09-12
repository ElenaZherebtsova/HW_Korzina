package pro.sky.HWKorzina.Service;

import pro.sky.HWKorzina.DTO.Tovar;

import java.util.Collection;
import java.util.List;

public interface TovarService {

    void addTovar(List<Long> items);

    List<Long> getTovar();


}
