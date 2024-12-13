package model;

public class ContaSimples {

    private String nomeDoCorrentista;
    private double saldo;
    private boolean ehEspecial;

    public ContaSimples(String nomeDoCorrentista, double saldo, boolean ehEspecial) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEhEspecial() {
        return ehEspecial;
    }

    public void setEhEspecial(boolean ehEspecial) {
        this.ehEspecial = ehEspecial;
    }

    public boolean retira(double valor) {
        if (valor > saldo) {
            return false;
        } else {
            setSaldo(this.saldo - valor);
            return true;
        }
    }

    public boolean deposita(double valor) {
        if (valor <= 0) {
            return false;
        } else {
            setSaldo(this.saldo + valor);
            return true;
        }
    }

    public void mostrarDados() {
        System.out.println("Nome do correntista: " + getNomeDoCorrentista());
        System.out.println("Saldo: " + getSaldo());
        if (isEhEspecial()) {
            System.out.println("É especial");
        } else {
            System.out.println("Não é especial");
        }
    }

    public boolean tranferencia(ContaSimples conta, double valor) {
        if (valor > this.saldo) {
            return false;
        }
        if (conta.deposita(valor)) {
            this.setSaldo(this.saldo - valor);
        }
        return true;
    }

    /*
     * Escreva uma aplicação que demonstre o uso de instâncias da classe
     * ContaBancariaSimplificada implementada na seção 3.6.3. Crie um método
     * “transfere” do tipo booleano que tenha como parâmetros dois objetos
     * do tipo Conta e o valor a ser transferido de uma conta para outra. Esse
     * método deverá utilizar os métodos deposita e retira da classe. O tipo
     * booleano de retorno do método é para sinalizar se a operação de transferência
     * de valores foi realizada com sucesso, ou seja, se o valor a ser
     * transferido da conta de origem for menor ou igual ao saldo dessa conta
     */
}
