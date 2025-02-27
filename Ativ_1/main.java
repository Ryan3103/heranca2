package Ativ_1;

import Src.Normal;
import Src.Vip;

public class main {
    public static void main(String[] args) {

        Fornercedor Fornecedor1 = new Fornercedor();
        Fornecedor1.setValorCredito(12000);
        Fornecedor1.setValorDivida(5000);
        Fornecedor1.ImprimeValor();

        Pessoa Pessoa1 = new Pessoa();
        Pessoa1.setNome("Thallys");
        Pessoa1.setEndereço("Azideia");
        Pessoa1.setTelefone("3103921");
        Pessoa1.ImprimeValor();

    }
}