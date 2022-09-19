fun testeCondicionais(saldo: Double) {

    if (saldo > 0.0) {
        println("modelo.Conta e positiva!")
    } else if (saldo == 0.0) {
        println("modelo.Conta esta zerada");
    } else {
        println("modelo.Conta esta negativa");
    }

    when {
        saldo > 0.0 -> println("modelo.Conta e positiva!");
        saldo == 0.0 -> println("modelo.Conta esta zerada");
        else -> println("modelo.Conta esta negativa");

    }
}