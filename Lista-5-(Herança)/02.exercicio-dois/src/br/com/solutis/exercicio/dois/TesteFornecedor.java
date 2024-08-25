package br.com.solutis.exercicio.dois;

public class TesteFornecedor {
    public static void main(String[] args) {
        // Criação de um fornecedor usando o construtor com todos os atributos
        Fornecedor fornecedor1 = new Fornecedor("João Silva", "Rua das Flores, 123", "1234-5678", 10000.0, 2500.0);

        // Exibindo as informações do fornecedor1 antes da alteração
        System.out.println("Fornecedor 1 (antes da alteração):");
        System.out.println(fornecedor1); // Usa toString() para exibir todos os dados
        System.out.println("Saldo: " + fornecedor1.obterSaldo());

        // Alterando o valor do crédito e da dívida usando setters
        fornecedor1.setValorCredito(15000.0);
        fornecedor1.setValorDivida(3000.0);

        // Exibindo as informações do fornecedor1 após a alteração
        System.out.println("\nFornecedor 1 (depois da alteração):");
        System.out.println(fornecedor1); // Usa toString() para exibir todos os dados
        System.out.println("Saldo: " + fornecedor1.obterSaldo());

        // Criação de um fornecedor usando o construtor com nome e telefone
        Fornecedor fornecedor2 = new Fornecedor("Maria Oliveira", "Rua das Jazidas, 234", "5678-1234", 5000.0, 5000.0);

        // Exibindo as informações do fornecedor2
        System.out.println("\nFornecedor 2:");
        System.out.println(fornecedor2); // Usa toString() para exibir todos os dados
        System.out.println("Saldo: " + fornecedor2.obterSaldo());

        // Criação de um fornecedor usando o construtor padrão e setters
        Fornecedor fornecedor3 = new Fornecedor();
        fornecedor3.setNome("Kauê Alexandre");
        fornecedor3.setEndereco("São Paulo, SP");
        fornecedor3.setTelefone("(11) 91234-5678");
        fornecedor3.setValorCredito(5000.0);
        fornecedor3.setValorDivida(1500.0);

        // Exibindo as informações do fornecedor3
        System.out.println("\nFornecedor 3:");
        System.out.println(fornecedor3); // Usa toString() para exibir todos os dados
        System.out.println("Saldo: " + fornecedor3.obterSaldo());
    }
}