package br.com.sulutis.exercicio.tres;

import br.com.solutos.exercicio.um.Pessoa;

public class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto; // porcentagem retida dos impostos

    // Construtor padrão
    public Empregado() {
    }

    // Construtor com todos os atributos
    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    // Getters e Setters
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

    // Método para calcular o salário líquido
    public double calcularSalario() {
        double desconto = salarioBase * (imposto / 100);
        return salarioBase - desconto;
    }

    // Sobrescrevendo o método toString para exibir os dados do Empregado
    @Override
    public String toString() {
        return "Empregado {" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + codigoSetor +
                ", salarioBase=" + salarioBase +
                ", imposto=" + imposto +
                ", salarioLiquido=" + calcularSalario() +
                '}';
    }
}
