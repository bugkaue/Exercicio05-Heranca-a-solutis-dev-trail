# Exercicio05-Heranca-a-solutis-dev-trail

Este repositório contém soluções para uma série de exercícios de programação em Java, abordando conceitos como herança, encapsulamento.

## Exercício 01 - Classe Pessoa

Crie uma classe `Pessoa` com os seguintes atributos:
- `nome` (String)
- `endereço` (String)
- `telefone` (String)

A classe deve incluir:
- Construtor padrão
- Construtores adicionais conforme necessidade
- Métodos getters e setters para os atributos

## Exercício 02 - Classe Fornecedor

Crie uma classe `Fornecedor` que estende `Pessoa`. Adicione os seguintes atributos:
- `valorCredito` (double)
- `valorDivida` (double)

A classe deve incluir:
- Métodos getters e setters
- Método `obterSaldo()` que calcula a diferença entre `valorCredito` e `valorDivida`

## Exercício 03 - Classe Empregado

Crie uma classe `Empregado` que estende `Pessoa`. Adicione os seguintes atributos:
- `codigoSetor` (int)
- `salarioBase` (double)
- `imposto` (double)

A classe deve incluir:
- Métodos getters e setters
- Método `calcularSalario()` que calcula o salário após impostos

## Exercício 04 - Classe Administrador

Crie uma classe `Administrador` que estende `Empregado`. Adicione o atributo:
- `ajudaDeCusto` (double)

A classe deve redefinir o método `calcularSalario()` para incluir a ajuda de custo.

## Exercício 05 - Classe Operario

Crie uma classe `Operario` que estende `Empregado`. Adicione os seguintes atributos:
- `valorProducao` (double)
- `comissao` (double)

A classe deve redefinir o método `calcularSalario()` para incluir a comissão sobre o valor da produção.

## Exercício 06 - Classe Vendedor

Crie uma classe `Vendedor` que estende `Empregado`. Adicione os seguintes atributos:
- `valorVendas` (double)
- `comissao` (double)

A classe deve redefinir o metodo `calcularSalario()` para incluir a comissão sobre o valor das vendas.


1. Clone o repositório:

   ```bash
   
      git clone https://github.com/bugkaue/Exercicio05-Heranca-a-solutis-dev-trail.git   
