package Ativ1;

public class main {
        public static void main(String[] args) {
                Fornecedor fornecedor = new Fornecedor("João", "Rua A, 123", "1234-5678", 5000, 1200);
                System.out.println("Saldo do fornecedor: " + fornecedor.obterSaldo());

                Empregado empregado = new Empregado("Maria", "Rua B, 456", "8765-4321", 101, 3000, 10);
                System.out.println("Salário do empregado: " + empregado.calcularSalario());

                Administrador administrador = new Administrador("Carlos", "Rua C, 789", "1122-3344", 102, 5000, 15, 1000);
                System.out.println("Salário do administrador: " + administrador.calcularSalario());

                Operario operario = new Operario("Ana", "Rua D, 321", "4433-2211", 103, 2500, 8, 10000, 5);
                System.out.println("Salário do operário: " + operario.calcularSalario());

                Vendedor vendedor = new Vendedor("Pedro", "Rua E, 654", "9988-7766", 104, 2800, 12, 20000, 3);
                System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
        }
}