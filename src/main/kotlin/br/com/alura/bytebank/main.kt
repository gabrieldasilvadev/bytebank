import br.com.alura.bytebank.modelo.Endereco
import java.lang.Exception

fun main(args: Array<String>) {

    println("Inicio main");
    funcao1();
    println("Fim main");
}



fun funcao1() {
    println("Inicio funcao1");
    try {
        funcao2();
    } catch (e: ClassCastException) {
        println("ClassCastException foi pegada");
        e.printStackTrace();
    }
    println("Fim funcao1");
}

fun funcao2() {

    println("Inicio funcao2");
    for (i in 1..5) {
        println(i);
        val endereco = Any();
        throw NumberFormatException();
    }
    println("Fim funcao2");
}












