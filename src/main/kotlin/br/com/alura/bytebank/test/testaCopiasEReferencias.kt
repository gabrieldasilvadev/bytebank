import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaCopiaEReferencia() {
    val numeroX = 10;
    var numeroY = numeroX;
    numeroY++;

    println("numeroX $numeroX");
    println("numeroY $numeroY");

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

    val joao: Cliente = Cliente("Joao", "111.111.111-11", enderecoGabriel,1);

    val contaJoao = br.com.alura.bytebank.modelo.ContaPoupanca(joao, 1002);
//    contaJoao.titular = "João";

    val maria: Cliente = Cliente("Maria", "222.222.222-22", enderecoAlexl,2);

    var contaMaria = br.com.alura.bytebank.modelo.ContaCorrente(maria, 1003);
//    contaMaria.titular = "Maria";
//    contaJoao.titular = "João";

    println("titular conta joao: ${contaJoao.titular}");
    println("titular conta maria: ${contaMaria.titular}");

    println(contaJoao);
    println(contaMaria);
}