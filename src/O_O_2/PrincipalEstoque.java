package O_O_2;

import java.util.stream.IntStream;

public class PrincipalEstoque {
    public static void main(String[] Args) {
        Estoque[] estoque = new Estoque[3];

        estoque[0] = new Estoque();
        estoque[0].setNomeProduto("produto1");
        estoque[0].setValor(401);
        estoque[0].setQuantidade(80);

        estoque[1] = new Estoque();
        estoque[1].setNomeProduto("produto2");
        estoque[1].setValor(57);
        estoque[1].setQuantidade(40);

        estoque[2] = new Estoque();
        estoque[2].setNomeProduto("produto3");
        estoque[2].setValor(35);
        estoque[2].setQuantidade(70);


        IntStream.range(0, 3).forEachOrdered(index -> estoque[index].imprimir());    //intelij deu a ideia de usar forEachOrdered no lugar de um For, interessante.

        estoque[0].removerProdutos(50);
        estoque[1].removerProdutos(50);
        estoque[2].removerProdutos(50);

        IntStream.range(0, 3).forEachOrdered(index -> estoque[index].imprimir());

    }
}
