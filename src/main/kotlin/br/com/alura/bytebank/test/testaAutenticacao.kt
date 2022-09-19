import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente: br.com.alura.bytebank.modelo.Gerente = br.com.alura.bytebank.modelo.Gerente(
        "Gabriel",
        "111.111.111-11",
        1000.0,
        123
    );

    val diretora: br.com.alura.bytebank.modelo.Diretor = br.com.alura.bytebank.modelo.Diretor(
        "Fran",
        "111.111.111-11",
        2000.0,
        123,
        plr = 200.0
    );

    val sistema: br.com.alura.bytebank.modelo.SistemaInterno = br.com.alura.bytebank.modelo.SistemaInterno();

    sistema.entra(gerente, 123);
    sistema.entra(diretora, 123);
}