package Ativ_1;

public class Empregado {
    int codigoSetor;
    double salarioBase;
    double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Empregado(int codigoSetor, double salarioBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;


    }
    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }
}

