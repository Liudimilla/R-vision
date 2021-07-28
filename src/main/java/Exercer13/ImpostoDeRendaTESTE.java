package Exercer13;

import java.util.Scanner;

public class ImpostoDeRendaTESTE {
    public static void main(String[] args) {
// para pesquisar autentificadoe de CPF e CNPJ; geradordecnpj.clevert.com.br/cnpj.php
        Scanner milla = new Scanner(System.in);

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("123.345.345-90");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("99.789.789/0001-56");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(2000);
        p3.setCpf("890.345.345-90");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 04");
        p4.setRendaBruta(3000);
        p4.setCnpj("89.789.789/0001-56");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 05");
        p5.setRendaBruta(3700);
        p5.setCpf("980.345.345-90");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 06");
        p6.setRendaBruta(4000);
        p6.setCnpj("239.789.789/0001-06");

        //Para testar o polimosfismo

        ImpostoDeRenda[] contribuinte = new ImpostoDeRenda[6];
        contribuinte[0] = p1;
        contribuinte[1] = p2;
        contribuinte[2] = p3;
        contribuinte[3] = p4;
        contribuinte[4] = p5;
        contribuinte[5] = p6;

        for (ImpostoDeRenda c : contribuinte) {
            System.out.println(c.toString());
        }

    }
}
