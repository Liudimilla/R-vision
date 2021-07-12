package Exercer02;

import java.util.Scanner;
/*Questao 17.3;Faça um programa que leia e valide as seguintes informaçoes;
a.Nome: maior que 3 caracteres;
b.Idade: Entre 0 e 150;
c.Salario: maior que zero;
d.Sexo: 'f' ou 'm'
e.Estado Civil:'s','c','v','d';
 */
public class Validaçao {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        do {
            System.out.println("Entre com o nome: ");
            nome = scan.next();
            if (nome.length()>= 3) {
                //length para contar caracteres
                infoValida = true;
            } else {
                System.out.println("Nome precisa no minimo 3 caracteres.");
            }
            }while (!infoValida);
//*!infoValida fica INVALIDA E PARA E VAI PARA O DO
            infoValida = false;
            do {
                System.out.println("Entre com a idade");
                idade = scan.nextInt();
                if (idade >= 0 && idade <= 150) {
                    infoValida = true;
                } else {
                    System.out.println("Idade precisa ser entre 0 e 150. ");
                }
            } while (!infoValida);
        infoValida = false;
        do {
            System.out.println("Entre com o salario: ");
            salario = scan.nextDouble();
            if (salario > 0){
                infoValida = true;
            }else{
                System.out.println("Salario precisa ser maior que 0.");
            }
        } while (!infoValida);

        infoValida = false;
    do {
        System.out.println("Entre com o sexo");
        sexo = scan.next();
        // NEXT PQ A a variavel e String;
        if (sexo.equalsIgnoreCase("f") ||
        sexo.equalsIgnoreCase("m")){
            infoValida = true;
    } else {
            System.out.println("Sexo precisa ser 'f' ou 'm'.");

        }
    }while (!infoValida);
    infoValida = false;
    do {
        System.out.println("Entre com o estado civil");
        estadoCivil = scan.next();
        if(estadoCivil.equalsIgnoreCase("s") ||
        estadoCivil.equalsIgnoreCase("c") ||
        estadoCivil.equalsIgnoreCase("v") ||
        estadoCivil.equalsIgnoreCase("d")){
    infoValida = true;
        } else {
    System.out.println("Estado civil precisa ser 's','c','v' ou 'd'");

        }
    }while (!infoValida);

    System.out.println("As seguintes informaçoes foram coletadas: ");
    System.out.println("nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salario " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado civil: " + estadoCivil);

    }

    }


