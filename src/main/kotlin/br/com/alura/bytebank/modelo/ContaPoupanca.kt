package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1;
        if (this.saldo >= valorComTaxa) this.saldo -= valorComTaxa;

    }

    override fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    override fun transfere(valor: Double, contaDestino: br.com.alura.bytebank.modelo.Conta): Boolean {

        if (valor <= this.saldo) {
            contaDestino.deposita(valor);
            return true;
        }

        return false;
    }
}
