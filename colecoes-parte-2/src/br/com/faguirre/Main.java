package br.com.faguirre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        colecoes();
    }

    private static void colecoes() {
        List<Identidade> lista = new ArrayList<Identidade>();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome e sexo: ");
        Identidade a = new Identidade(s.next(), s.next());
        lista.add(a);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
