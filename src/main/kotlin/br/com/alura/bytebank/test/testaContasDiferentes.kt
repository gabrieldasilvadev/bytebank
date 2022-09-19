import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

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

    val gabriel: Cliente = Cliente("Gariel", "111.111.111-11", enderecoGabriel, 1);

    val contaCorrente: ContaCorrente = ContaCorrente(
        titular = gabriel,
        numero = 1000
    );

    val alex: Cliente = Cliente("Alex", "222.222.222-22", enderecoAlexl, 2);

    val contaPoupanca: ContaPoupanca = ContaPoupanca(
        titular = alex,
        numero = 1001
    );

    contaCorrente.deposita(1000.0);
    contaPoupanca.deposita(1000.0);

    println("Saldo conta corrente: ${contaCorrente.saldo}");
    println("Saldo conta poupanca: ${contaPoupanca.saldo}");

    contaCorrente.saca(100.0);
    contaPoupanca.saca(100.0);

    println("Saldo apos saque conta corrente: ${contaCorrente.saldo}");
    println("Saldo apos saque conta poupanca: ${contaPoupanca.saldo}");

    contaCorrente.transfere(100.0, contaPoupanca);
    println("Saldo corrente apos transferir para poupanca: ${contaCorrente.saldo}");
    println("Saldo poupanca apos receber transferencia: ${contaPoupanca.saldo}");

    println("titular")
    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular: ${contaCorrente.titular.cpf}")
    println("Logradouro do titular: ${contaCorrente.titular.endereco.logradouro}")
}