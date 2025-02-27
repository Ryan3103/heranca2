package Ativ_1;

public class Pessoa {

    String nome;
    String endereço;
    String telefone;
    int CPF;
    int CNPJ;

    public Pessoa() {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereço = endereço;
        this.telefone = telefone;
        this.CPF = CPF;
    }
public void ImprimeValor() {
    System.out.println("O nome é: " + nome);
    System.out.println("O seu endereço é: " + endereço);
    System.out.println("O seu telefone é: " + telefone);
    System.out.println("Seu CPF: " + CPF);
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}