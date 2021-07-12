/*Questao 16.20.Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são: . "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a
participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser
 classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário
 , ele será classificado como "Inocente". */
package Exercer02;

import java.util.Scanner;

public class Investigacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String resp1 = scan.next();
        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();
        System.out.println("Mora perto da vítima?");
        String resp3 = scan.next();
        System.out.println("Devia para a vítima?");
        String resp4 = scan.next();
        System.out.println("Já trabalhou com a vítima?");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp2.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp3.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp4.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp5.equalsIgnoreCase("S")) {
            cont++;
        }
        if (cont == 2) {
            System.out.println("Suspeita");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Cumplice");
        } else if (cont == 5) {
            System.out.println("Assassino"); }
             else if (cont == 0) {
                System.out.println("Inocente");

            }
        }
    }
