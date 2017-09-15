
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loc
 */
public class Carrinho {

    private int codigo;
    private Cliente cliente;
    private List<Item> itens;
    private Date dataCompra;
    private double totalCompra;

    public Carrinho(int codigo) {
        this.codigo = codigo;
        this.dataCompra = Calendar.getInstance().getTime();
        this.itens = new ArrayList<>();

    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(int item) {
        itens.remove(item);
    }

    public void calcularTotal() {
        itens.forEach((i) -> {
            this.totalCompra += i.getValor();
        });
    }

    public void exibirCarrinho() {
        System.out.println("Carrinho: " + codigo);
        System.out.println("Data compra: "
                + DateFormat.getDateInstance().format(dataCompra));
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Itens: ");
        itens.forEach((i) -> {
            System.out.println("\t" + i.getNome() + " - "
                    + NumberFormat.getCurrencyInstance().format(i.getValor()));
        });
        this.calcularTotal();
        System.out.println("Total: "
                + NumberFormat.getCurrencyInstance().format(this.getTotalCompra()));
    }
} //fim classe
