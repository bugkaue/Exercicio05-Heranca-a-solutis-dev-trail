package br.com.solutis.exercicio.quatro;

public class TesteAdministrador {
    public static void main(String[] args) {
        // Criando uma instância da classe Administrador usando o construtor padrão
        Administrador administrador1 = new Administrador();
        administrador1.setNome("Kauê Alexandre");
        administrador1.setEndereco("Avenida dos Ypês, 758");
        administrador1.setTelefone("555-555-5555");
        administrador1.setCodigoSetor(1);
        administrador1.setSalarioBase(5000.0);
        administrador1.setImposto(30.0);
        administrador1.setAjudaDeCusto(1000.0);

        // Exibindo as informações do administrador1
        System.out.println("Administrador 1 (usando construtor padrão e setters):");
        System.out.println(administrador1); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + administrador1.calcularSalario());
        System.out.println();

        // Criando uma instância da classe Administrador usando o construtor com todos os atributos
        Administrador administrador2 = new Administrador("Ana Costa", "Avenida das Empresas, 789", "5555-6789", 1, 7000.0, 12.0, 1000.0);

        // Exibindo as informações do administrador2
        System.out.println("Administrador 2 (usando construtor com todos os atributos):");
        System.out.println(administrador2); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + administrador2.calcularSalario());
        System.out.println();

        // Criando uma instância da classe Administrador usando o construtor com ajuda de custo
        Administrador administrador3 = new Administrador(1500.0);
        administrador3.setNome("Carlos Silva");
        administrador3.setEndereco("Rua das Palmeiras, 456");
        administrador3.setTelefone("5555-1234");
        administrador3.setCodigoSetor(2);
        administrador3.setSalarioBase(6000.0);
        administrador3.setImposto(15.0);

        // Exibindo as informações do administrador3
        System.out.println("Administrador 3 (usando construtor com ajuda de custo):");
        System.out.println(administrador3); // Usa toString() para exibir todos os dados
        System.out.println("Salário Líquido: " + administrador3.calcularSalario());
    }
}


