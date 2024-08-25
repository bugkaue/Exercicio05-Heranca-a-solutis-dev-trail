package br.com.sulutis.exercicio.tres;

public class TesteEmpregado {
    public static void main(String[] args) {
        // Criando uma instância da classe Empregado usando o construtor padrão
        Empregado empregado = new Empregado();

        // Definindo valores usando os métodos setters
        empregado.setNome("Maria Silva");
        empregado.setEndereco("Avenida Central, 123");
        empregado.setTelefone("5555-1234");
        empregado.setCodigoSetor(2);
        empregado.setSalarioBase(6000.0);
        empregado.setImposto(15.0);

        // Exibindo os dados do empregado e o salário líquido usando o método toString
        System.out.println(empregado);

        // Criando uma nova instância da classe Empregado usando o construtor com todos os atributos
        Empregado empregado2 = new Empregado("João Pereira", "Rua das Flores, 456", "5555-5678", 3, 8000.0, 10.0);

        // Exibindo os dados do segundo empregado usando o método toString
        System.out.println(empregado2);

        // Testando os métodos getters e setters individualmente
        System.out.println("Dados do empregado2:");
        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Endereço: " + empregado2.getEndereco());
        System.out.println("Telefone: " + empregado2.getTelefone());
        System.out.println("Código do Setor: " + empregado2.getCodigoSetor());
        System.out.println("Salário Base: " + empregado2.getSalarioBase());
        System.out.println("Imposto: " + empregado2.getImposto());
        System.out.println("Salário Líquido: " + empregado2.calcularSalario());
    }
}
