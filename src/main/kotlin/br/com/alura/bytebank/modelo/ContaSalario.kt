package br.com.alura.bytebank.modelo

class ContaSalario(titular: Cliente, numero: Int) : br.com.alura.bytebank.modelo.Conta(titular, numero) {
    override fun deposita(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun saca(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun transfere(valor: Double, contaDestino: br.com.alura.bytebank.modelo.Conta): Boolean {
        TODO("Not yet implemented")
    }

}