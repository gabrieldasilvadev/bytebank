import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {

    val gabriel: br.com.alura.bytebank.modelo.Analista = br.com.alura.bytebank.modelo.Analista(
        "Gabriel",
        "111.111.111-11",
        1000.0
    );

    println("Nome: ${gabriel.nome}");
    println("cpf: ${gabriel.cpf}");
    println("Salario: ${gabriel.salario}");
    println("Bonificacao: ${gabriel.bonificacao}");

    val fran = br.com.alura.bytebank.modelo.Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    );

    println("Nome: ${fran.nome}");
    println("cpf: ${fran.cpf}");
    println("Salario: ${fran.salario}");
    println("Bonificacao: ${fran.bonificacao}");

    if (fran.autentica(124)) {
        println("Autenticou com sucesso");
    } else {
        println("Falha na autenticacao");
    }

    val gui = br.com.alura.bytebank.modelo.Diretor(
        nome = "Guilherme",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 1234,
        plr = 2500.0
    );

    println("Nome: ${gui.nome}");
    println("cpf: ${gui.cpf}");
    println("Salario: ${gui.salario}");
    println("Bonificacao: ${gui.bonificacao}");
    println("PLR: ${gui.plr}");


    val maria: br.com.alura.bytebank.modelo.Analista =
        br.com.alura.bytebank.modelo.Analista("Maria", "444.444.444-44", 4000.0);


    val calculadora: br.com.alura.bytebank.modelo.CalculadoraBonificacao =
        br.com.alura.bytebank.modelo.CalculadoraBonificacao();
    calculadora.registra(gui);
    calculadora.registra(gabriel);
    calculadora.registra(fran);
    calculadora.registra(maria);

    println("Total de bonificacao: ${calculadora.total}");
}