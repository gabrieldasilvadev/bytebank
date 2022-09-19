package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double

) : br.com.alura.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    senha = senha,
    salario = salario
), br.com.alura.bytebank.modelo.Autenticavel {

    override val bonificacao: Double get() = salario * 1.3 + plr;

}