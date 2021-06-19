package Exercer02;

import java.util.Scanner;

/*Questao 17.2; Faça um programa que leia um nome de usuario e a sua senha e nao aceite a senha igual ao nome do usuario, mostre uma mensagem de
erro e voltando a pedir as informaçoes.

 */
public class UsuarioSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValidos = false;
        do {
            System.out.println("Entre com o nome do usuario: ");
            String nomeUser = scan.next();

            System.out.println("Entre com a senha: ");
            String senha = scan.next();

            boolean infoValidas;
            if (nomeUser.equalsIgnoreCase(senha)) {
                //infoValidas = false;
                System.out.println("Senha igual a usuario, digite novamente");
            } else {
                infoValidas = true;
                System.out.println("Senha e usuario validos. ");
            }

        } while (!infoValidos);
    }
}

