package br.com.solutis.exercicio.seis;

public class TesteVendedor {
    public static void main(String[] args) {
        // Testando o construtor padrão
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Roberto Santos");
        vendedor1.setEndereco("Avenida das Vendas, 321");
        vendedor1.setTelefone("1234-5678");
        vendedor1.setCodigoSetor(4);
        vendedor1.setSalarioBase(3000.0);
        vendedor1.setImposto(20.0);
        vendedor1.setValorVendas(50000.0);
        vendedor1.setComissao(5.0);

        System.out.println("Vendedor 1 (construtor padrão):");
        System.out.println(vendedor1); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + vendedor1.calcularSalario());

        // Testando o construtor com todos os atributos
        Vendedor vendedor2 = new Vendedor("Mariana Lima", "Rua do Comércio, 789", "9876-5432", 2, 4000.0, 15.0, 80000.0, 7.0);

        System.out.println("\nVendedor 2 (construtor com todos os atributos):");
        System.out.println(vendedor2); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + vendedor2.calcularSalario());

        // Alterando atributos usando setters e testando novamente
        vendedor2.setValorVendas(90000.0);
        vendedor2.setComissao(10.0);

        System.out.println("\nVendedor 2 (após alteração dos atributos):");
        System.out.println(vendedor2); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + vendedor2.calcularSalario());
    }
}

