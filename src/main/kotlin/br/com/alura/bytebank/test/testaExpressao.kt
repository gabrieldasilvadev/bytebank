package br.com.alura.bytebank.test

private fun testaExpressao() {
    val entrada: String = "1.0";

    val valorRecebido: Double? = try {
        entrada.toDouble();
    } catch (e: NumberFormatException) {
        println("NumberFormatException pegada");
        e.printStackTrace();
        null;
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1;
    } else {
        null;
    }

    if (valorComTaxa != null) {
        println("Valor recebido $valorComTaxa");
    } else {
        println("valor invalido");
    }
}