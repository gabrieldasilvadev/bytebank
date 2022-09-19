package br.com.alura.bytebank.modelo


abstract class Conta(
    var titular: Cliente,
    val numero: Int,
) {

    var saldo: Double = 0.0
        protected set;

    companion object {
        var total: Int = 0
            private set
    }

    init {
        total++;
    }


    abstract fun deposita(valor: Double);

    abstract fun saca(valor: Double);

    abstract fun transfere(valor: Double, contaDestino: br.com.alura.bytebank.modelo.Conta): Boolean;
}