fun testeLacos() {
    var i = 0;
    while (i < 5) {
        val titular: String = "Gabriel $i";
        val numeroConta: Int = 1000 + i;
        var saldo: Double = 0.0 + i;

        println("titular: $titular");
        println("numero da conta: $numeroConta");
        println("saldo da conta: $saldo");
        i++;
    }

    for (i in 1..100) {
        println("i $i");
        for (j in 1..100) {
            println("j $j");
            if (j == 5) break;
        }
    }
}