package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Livro> livrosLoja = new ArrayList<>();

    //BOTÃO CADASTRAR LIVRO

    public void cadastarLivro(Livro livro) {
        this.livrosLoja.add(livro);
    }

    //BOTÃO CONSULTAR LIVRO

    public void consultarLivroPorCodigo(int codigo) {

        //INICIALIZANDO VARIAVEL PARA CONSULTA
        Livro consulta = null;

        for (Livro livro : livrosLoja) {
            if (livro.getCodigo() == codigo) {
                consulta = livro;
            }
        }

        if (consulta != null) {
            System.out.println(consulta);
        } else {
            System.out.println("LIVRO NÃO ENCONTRADO");
        }

    }

    //BOTÃO VENDER LIVRO

    public void venderLivroPorCodigo(int codigo) {

        //INICIALIZANDO VARIAVEL PARA VENDA
        Livro venda = null;

        for (Livro livro : livrosLoja) {
            if (livro.getCodigo() == codigo) {
                venda = livro;
            }
        }

        if (venda == null){
            System.out.println("LIVRO NÃO DISPONIVEL NA LOJA");
        }else{
            if(venda.getQuantidadeEstoque()>0){
                System.out.println("SALDO DISPONIVEL NA LOJA ANTES DA VENDA: \n" + venda.getQuantidadeEstoque());
                venda.setQuantidadeEstoque(venda.getQuantidadeEstoque() - 1);
                System.out.println(venda);
            }else{
                System.out.println("LIVRO ESGOTADO");
            }
        }
    }
}
