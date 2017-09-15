
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Loc
 */
public class TesteCarrinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true) {
            int codigoCliente = 0;
            int codigoCarrinho = 0;
            System.out.println("\n\nLista de Itens:");
            System.out.println("[1] - Mouse HP - R$ 50.00");
            System.out.println("[2] - Teclado Logitech - R$ 69.90");
            System.out.println("[3] - Monitor LED - R$ 799.99");
            System.out.println("[4] - Headset SONY - R$ 199.90");

            System.out.print("\nInforme seu nome: ");
            String nome = sc.next();
            System.out.print("\nInforme seu email: ");
            String email = sc.next();

            Cliente cliente = new Cliente(++codigoCliente, nome, email);
            Carrinho carrinho = new Carrinho(++codigoCarrinho);
            carrinho.setCliente(cliente);
            do {
                System.out.print("Informe o código do Item ou 0 para finalizar o carrinho: ");
                int codigoItem = sc.nextInt();
                if (codigoItem == 0) {
                    break;
                } //fim if 
                Item item = null;
                switch (codigoItem) {
                    case 1:
                        item = new Item(1, "Mouse HP", 50.00);
                        break;
                    case 2:
                        item = new Item(2, "Teclado Logitech", 69.90);
                        break;
                    case 3:
                        item = new Item(3, "Monitor LED", 799.99);
                        break;
                    case 4:
                        item = new Item(4, "Headset SONY", 199.90);
                        break;
                    default:
                        System.out.println("Código inválido!");

                } //fim switch case
                if (item != null){
                carrinho.adicionarItem(item);
                }
            } while (true);//fim do 
            carrinho.exibirCarrinho();
            System.out.print("Abrir nova compra [S/N]: ");
            String resposta = sc.next();
            if (resposta.equals ("n") || resposta.equals ("N")) {
                System.out.println("Fim");
            }
        } //fim while 

    } //fim main

} // fim classe
