package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Livraria livraria = new Livraria();

        Livro livro1 = new Livro(123, "SENHOR DOS ANEIS", "TOLKIEN", "1920", "ABC123", 100, 60.50);
        Livro livro2 = new Livro(456, "HARRY POTTER", "ROWLING", "2000", "ABC456", 100, 40.30);
        Livro livro3 = new Livro(789, "ALICE", "LEWIS", "1915", "ABC789", 100, 50.25);

        List<Livro> livrosLivraria = new ArrayList<>();
        livrosLivraria.add(livro1);
        livrosLivraria.add(livro2);
        livrosLivraria.add(livro3);



        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UMA DAS OPÇÕES");
        System.out.println("CADASTRAR LIVRO..... 1");
        System.out.println("CONSULTAR LIVRO......2");
        System.out.println("VENDER LIVRO.........3");

        int opcao = scanner.nextInt();

//        if (opcao == 1){
//            System.out.println("DIGITE O CODIGO DO LIVRO........:");
//            int codigo = scanner.nextInt();
//            livraria.cadastarLivro();
//        }

        if (opcao == 2) {
            System.out.println("DIGITE O CODIGO DO LIVRO PARA CONSULTA....:");
            int codigo = scanner.nextInt();
            livraria.consultarLivroPorCodigo(codigo);
        }

        if (opcao == 3) {
            System.out.println("DIGITE O CODIGO DO LIVRO PARA VENDA.......:");
            int codigo = scanner.nextInt();
            livraria.venderLivroPorCodigo(codigo);
        }
   }
}
