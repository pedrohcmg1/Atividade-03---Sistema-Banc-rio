public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("12345", "João", 1000.0, 500.0);
        ContaBancaria cp = new ContaPoupanca("54321", "Maria", 2000.0);
        ContaBancaria ci = new ContaInvestimento("67890", "Pedro", 5000.0);
        ContaBancaria cs = new ContaSalario("13579", "Lucas", 1000.0, 300.0);
        ContaBancaria car = new ContaInvestimentoAltoRisco("24680", "Ana", 12000.0);

        cc.depositar(200);
        cc.sacar(500);
        cc.exibirInformacoes();

        cp.depositar(300);
        cp.sacar(500);
        cp.exibirInformacoes();

        ci.depositar(500);
        ci.sacar(1000);
        ci.exibirInformacoes();

        cs.depositar(200);
        cs.sacar(300);
        cs.sacar(100);
        cs.exibirInformacoes();

        car.depositar(1000);
        car.sacar(5000);
        car.exibirInformacoes();
    }
}