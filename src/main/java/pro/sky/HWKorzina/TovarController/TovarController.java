package pro.sky.HWKorzina.TovarController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.HWKorzina.Service.TovarService;
import java.util.List;

@RestController
@RequestMapping("/order")
public class TovarController {
    private final TovarService tovarService;

    public TovarController(TovarService tovarService) {
        this.tovarService = tovarService;
    }

    @GetMapping("/add")
    public String  addTovar(@RequestParam List<Long> items) {
        tovarService.addTovar(items);
        return "Товар добавлен в корзину.";
    }

    @GetMapping("/get")
    public List<Long> getTovar() {
        return tovarService.getTovar();
    }
}
