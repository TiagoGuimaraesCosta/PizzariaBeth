package Pizzaria_VovoBETH.Controller;

import Pizzaria_VovoBETH.Model.Pedido;
import Pizzaria_VovoBETH.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido createPedido(@RequestBody Pedido pedido) {
        return pedidoService.save(pedido);
    }

    @GetMapping
    public List<Pedido> getAllPedidos() {
        return pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public Pedido getPedidoById(@PathVariable Long id) {
        return pedidoService.findById(id);
    }

    @PutMapping("/{id}")
    public Pedido updatePedido(@PathVariable Long id, @RequestBody Pedido pedidoDetails) {
        Pedido pedido = pedidoService.findById(id);
        if (pedido != null) {
            pedido.setItens(pedidoDetails.getItens());
            pedido.setTotal(pedidoDetails.getTotal());
            pedido.setStatus(pedidoDetails.getStatus());
            return pedidoService.save(pedido);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id) {
        pedidoService.deleteById(id);
    }
}
