package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: br.com.alura.bytebank.modelo.Autenticavel, senha: Int) {
        if(admin.autentica(senha)) {
            println("Bem-vindo ao Bytebank");
        } else {
            println("Falha na autenticacao");
        }
    }
}