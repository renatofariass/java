package entidades;

import enums.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date moment;
    private StatusDoPedido status;
    private Cliente cliente;
    private List<ItemDoPedido> itens = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Pedido(Date moment, StatusDoPedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public void addItem(ItemDoPedido item) {
        this.itens.add(item);
    }

    public void removerItem(ItemDoPedido item) {
        this.itens.remove(item);
    }

    public double total() {
        double soma = 0;
        for(ItemDoPedido itemDoPedido : itens) {
            soma += itemDoPedido.subTotal();
        }
        return soma;
    }


    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDoPedido> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do Pedido: ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append("Status do Pedido: ");
        sb.append(status).append("\n");
        sb.append("Cliente: ");
        sb.append(cliente).append("\n");
        sb.append("Itens do Pedido:\n");
        for (ItemDoPedido item : itens) {
            sb.append(item).append("\n");
        }
        sb.append("Preço Total: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
