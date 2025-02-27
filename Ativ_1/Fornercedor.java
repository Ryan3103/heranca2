package Ativ_1;

public class Fornercedor {
    double valorCredito;
    double valorDivida;

    public Fornercedor(){
    }

    public Fornercedor(double valorCredito, double valorDivida){
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void ImprimeValor() {
        System.out.println("Valor do credito: RS" + getValorCredito());
        System.out.println("Valor da divida: R$" + getValorDivida());
}

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}
