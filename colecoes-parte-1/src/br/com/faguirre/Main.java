package br.com.faguirre;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        colecoes();
    }

    private static void colecoes(){
        List<String> lista = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja cadastrar um nome? Responda S para SIM ou N para NÃO: ");
        String resposta = String.valueOf(s.next());

        while (resposta.equalsIgnoreCase("S")) {
            System.out.println("Digite o seu nome e sobrenome separados',': ");
            String nome = s.next();
            String vetStr = Arrays.toString(nome.split(","));
            lista.add(vetStr);
            Collections.sort(lista);
            System.out.println(lista);

            System.out.println("Deseja cadastrar novamente: ");
            resposta = String.valueOf(s.next());
        }
    }
}