package Pizzaria_VovoBETH.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class PedidoItem {
    private Long menuItemId;
    private int quantidade;
    public Long getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(Long menuItemId) {
        this.menuItemId = menuItemId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
