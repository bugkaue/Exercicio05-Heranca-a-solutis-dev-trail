package br.com.solutis.exercicio.cinco;

import br.com.sulutis.exercicio.tres.Empregado;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
    }

    public Operario(double valorProducao, double comissao) {
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double comissaoValor = valorProducao * (comissao / 100);
        return salarioBase + comissaoValor;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + getCodigoSetor() +
                ", salarioBase=" + getSalarioBase() +
                ", imposto=" + getImposto() +
                ", valorProducao=" + valorProducao +
                ", comissao=" + comissao +
                ", salarioLiquido=" + calcularSalario() +
                '}';
    }
}
