package Pizzaria_VovoBETH.Service;

import Pizzaria_VovoBETH.Model.MenuItem;
import Pizzaria_VovoBETH.Repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuItemService {
    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> findAll() {
        return menuItemRepository.findAll();
    }
}
