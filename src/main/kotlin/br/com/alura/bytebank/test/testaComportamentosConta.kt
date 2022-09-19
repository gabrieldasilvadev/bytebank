import br.com.alura.bytebank.modelo.*

fun testaComportamentosConta() {

    val enderecoGabriel: Endereco = Endereco(
        "Rua Vergueiro",
        1,
        "Bairro",
        "Sao Paulo",
        "SP",
        "08140060",
        "Casa 14"
    );

    val enderecoAlexl: Endereco = Endereco(
        "Rua Vergueiro",
        1,
        "Bairro",
        "Sao Paulo",
        "SP",
        "08140060",
        "Casa 14"
    );

    val gabriel: Cliente = Cliente("Gabriel", "111.111.111-11", enderecoGabriel, 2);

    val contaGabriel: Conta =
        ContaCorrente(titular = gabriel, numero = 1000);
    contaGabriel.deposita(200.0);
    println(contaGabriel.titular);

    val alex: Cliente = Cliente("Alex", "222.222.222-22", enderecoAlexl, 2);


    val contaAlex: br.com.alura.bytebank.modelo.Conta = ContaPoupanca(alex, 1001);
    contaAlex.deposita(100.0);
    println(contaAlex.titular);

    println(contaGabriel.titular);
    println(contaGabriel.numero);
    println(contaGabriel.saldo);

    println(contaAlex.titular);
    println(contaAlex.numero);
    println(contaAlex.saldo);

    println("depositando na conta do Gabriel");
    contaGabriel.deposita(50.0);
    println(contaGabriel.saldo);

    println("depositando na conta do Alex");
    contaAlex.deposita(50.0);
    println(contaAlex.saldo);

    println("sacando na conta do Gabriel");
    contaGabriel.saca(250.0);
    println(contaGabriel.saldo);

    println("sacando na conta do Alex");
    contaAlex.saca(250.0);
    println(contaAlex.saldo);

    println("saque em excesso na conta do Gabriel");
    contaGabriel.saca(100.0);
    println(contaGabriel.saldo);

    println("saque em excesso na conta do Alex");
    contaAlex.saca(100.0);
    println(contaAlex.saldo);

    if (contaGabriel.transfere(contaDestino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida");
    } else {
        println("Falha na transferência");
    }

    println(contaGabriel.saldo);
    println(contaAlex.saldo);
}