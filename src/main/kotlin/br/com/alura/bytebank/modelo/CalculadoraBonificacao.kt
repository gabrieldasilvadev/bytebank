package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set;

    fun registra(funcionaro: br.com.alura.bytebank.modelo.Funcionario) {
        println("Nome: ${funcionaro.nome}");
        this.total += funcionaro.bonificacao;
    }
}