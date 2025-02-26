class ContaSalario extends ContaCorrente {
    private int saquesGratuitosMensais;
    private double taxaSaque;

    public ContaSalario(String numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo, limiteChequeEspecial);
        this.saquesGratuitosMensais = 1;
        this.taxaSaque = 5.00;
    }

    @Override
    public void sacar(double valor) {
        if (saquesGratuitosMensais > 0) {
            super.sacar(valor);
            saquesGratuitosMensais--;
        } else {
            if (saldo + get LimiteChequeEspecial() >= (valor + taxaSaque)) {
                saldo -= (valor + taxaSaque);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

    private double LimiteChequeEspecial() {
    }
}