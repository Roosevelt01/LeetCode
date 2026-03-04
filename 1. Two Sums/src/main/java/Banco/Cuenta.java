package Banco;

public abstract class Cuenta {

    private double saldo;
    private String usuario;
    private String contraseña;

    public Cuenta(String usuario, String contraseña, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial inválido");
        }
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido");
        }

        if (saldo - monto < calcularLimitePermitido()) {
            throw new RuntimeException("Saldo insuficiente");
        }

        saldo -= monto;
    }

    protected abstract double calcularLimitePermitido();

    public double getSaldo() {
        return saldo;
    }
}