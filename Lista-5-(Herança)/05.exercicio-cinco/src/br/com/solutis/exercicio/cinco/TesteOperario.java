package br.com.solutis.exercicio.cinco;

public class TesteOperario {
    public static void main(String[] args) {
        // Testando o construtor padrão
        Operario operario1 = new Operario();
        operario1.setNome("Carlos Silva");
        operario1.setEndereco("Rua das Indústrias, 123");
        operario1.setTelefone("1234-5678");
        operario1.setCodigoSetor(3);
        operario1.setSalarioBase(4000.0);
        operario1.setImposto(20.0);
        operario1.setValorProducao(15000.0);
        operario1.setComissao(10.0);

        System.out.println("Operário 1 (construtor padrão):");
        System.out.println(operario1);
        System.out.println("Salário Líquido: " + operario1.calcularSalario());

        // Testando o construtor com valorProducao e comissao
        Operario operario2 = new Operario(20000.0, 5.0);
        operario2.setNome("Ana Costa");
        operario2.setEndereco("Rua dos Trabalhadores, 456");
        operario2.setTelefone("9876-5432");
        operario2.setCodigoSetor(2);
        operario2.setSalarioBase(5000.0);
        operario2.setImposto(15.0);

        System.out.println("\nOperário 2 (construtor com valorProducao e comissao):");
        System.out.println(operario2); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + operario2.calcularSalario());

        // Testando o construtor com todos os atributos
        Operario operario3 = new Operario("João Oliveira", "Avenida dos Operários, 789", "5555-6789", 1, 6000.0, 10.0, 10000.0, 7.0);

        System.out.println("\nOperário 3 (construtor com todos os atributos):");
        System.out.println(operario3); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + operario3.calcularSalario());
    }
}
