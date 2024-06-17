package Pizzaria_VovoBETH.Service;

import Pizzaria_VovoBETH.Model.Pedido;
import Pizzaria_VovoBETH.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Pedido findById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
