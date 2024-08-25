package br.com.solutis.exercicio.quatro;

import br.com.sulutis.exercicio.tres.Empregado;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(){
    }

    public Administrador(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        double salarioLiquido = super.calcularSalario();
        return salarioLiquido + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + getCodigoSetor() +
                ", salarioBase=" + getSalarioBase() +
                ", imposto=" + getImposto() +
                ", ajudaDeCusto=" + ajudaDeCusto +
                ", salarioLiquido=" + calcularSalario() +
                '}';
    }
}
