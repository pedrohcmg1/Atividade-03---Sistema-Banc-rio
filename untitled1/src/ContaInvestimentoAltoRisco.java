class ContaInvestimentoAltoRisco extends ContaInvestimento {
    private double saldoMinimoParaSaque;

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.saldoMinimoParaSaque = 10000.00;
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.05;
        if (saldo >= (valor + taxa) && saldo >= saldoMinimoParaSaque) {
            saldo -= (valor + taxa);
        } else {
            System.out.println("Saldo insuficiente ou saldo mínimo não alcançado.");
        }
    }
}