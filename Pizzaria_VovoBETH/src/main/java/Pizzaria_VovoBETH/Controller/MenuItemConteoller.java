package Pizzaria_VovoBETH.Controller;

import Pizzaria_VovoBETH.Model.MenuItem;
import Pizzaria_VovoBETH.Service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/menu")
public class MenuItemConteoller {
    @Autowired
    private MenuItemService menuItemService;

    @GetMapping
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.findAll();
    }
}
