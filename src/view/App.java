package view;

import model.ContaSimples;

public class App {
    public static void main(String[] args) throws Exception {
    
        ContaSimples clientR = new ContaSimples("Riquelme Oliveira", 450.00, true);
        ContaSimples clientA = new ContaSimples( "Raika Justino", 500.00, false);

        clientR.mostrarDados();
        clientA.mostrarDados();

        System.out.printf("\n\n");

        // Desculpe pelo meu banco mostrar o saldo das contas :(
        if(clientR.tranferencia(clientA, 100)){
            System.out.println("Transferência realizada com sucesso!");
            System.out.printf("O saldo de %s é %.2f", clientR.getNomeDoCorrentista(), clientR.getSaldo());
            System.out.printf("O saldo de %s é %.2f", clientA.getNomeDoCorrentista(), clientA.getSaldo());
        }else {
            System.out.printf("%s tem saldo insuficiente para realizar a transferência.", clientA.getNomeDoCorrentista());
        }

        System.out.printf("\n\n");

        clientR.mostrarDados();
        clientA.mostrarDados();
    }
}
