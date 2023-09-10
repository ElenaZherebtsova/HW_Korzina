package pro.sky.HWKorzina.TovarController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HWKorzina.DTO.Tovar;
import pro.sky.HWKorzina.Service.TovarService;

import java.util.Collection;

@RestController
@RequestMapping("/store/order")
public class TovarController {
    private TovarService tovarService;

    public TovarController(TovarService tovarService) {
        this.tovarService = tovarService;
    }

    @GetMapping("/add")
    public Tovar addTovar(@RequestParam int tovarID,
                          @RequestParam String tovarName,
                          @RequestParam double tovarPrice,
                          @RequestParam int tovarQuantity) {
        return tovarService.addTovar(tovarID, tovarName,
                tovarPrice, tovarQuantity);
    }

    @GetMapping
    public Collection<Tovar> printAll () {
        return tovarService.printAll();
    }
}
