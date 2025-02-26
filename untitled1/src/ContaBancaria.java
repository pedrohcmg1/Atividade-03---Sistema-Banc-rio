abstract class ContaBancaria {
    public String numeroConta;
    public String titular;
    public double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public abstract void sacar(double valor);

    public void exibirInformacoes(){
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo da conta: R$" + saldo);
    }
}
