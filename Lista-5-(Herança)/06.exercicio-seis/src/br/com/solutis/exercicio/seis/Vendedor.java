package br.com.solutis.exercicio.seis;

import br.com.sulutis.exercicio.tres.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double comissaoValor = valorVendas * (comissao / 100);
        return salarioBase + comissaoValor;
    }

    public String toString() {
        return "Vendedor{" +
                "nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", codigoSetor=" + getCodigoSetor() +
                ", salarioBase=" + getSalarioBase() +
                ", imposto=" + getImposto() +
                ", valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                ", salarioLiquido=" + calcularSalario() +
                '}';
    }
}