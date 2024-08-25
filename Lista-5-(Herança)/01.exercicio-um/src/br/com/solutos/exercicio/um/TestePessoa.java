package br.com.solutos.exercicio.um;

public class TestePessoa {
    public static void main(String[] args) {
        // Testando o construtor padrão e os setters
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Kauê Alexandre");
        pessoa1.setEndereco("São Paulo, SP");
        pessoa1.setTelefone("(11) 91234-5678");

        // Testando o construtor com dois parâmetros
        Pessoa pessoa2 = new Pessoa("Maria Silva", "Rio de Janeiro, RJ");

        // Testando o construtor com todos os atributos
        Pessoa pessoa3 = new Pessoa("João Pereira", "Belo Horizonte, MG", "(31) 98765-4321");

        // Exibindo os dados das pessoas utilizando o método toString()
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}