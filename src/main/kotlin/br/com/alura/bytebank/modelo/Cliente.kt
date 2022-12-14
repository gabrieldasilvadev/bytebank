package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : br.com.alura.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true;
        }

        return false;
    }
}