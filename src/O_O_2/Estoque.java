package O_O_2;

public class Estoque {
    String nomeProduto;
    int valor;
    int quantidade;


    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimir(){
        System.out.println("-----------------------------------");
        System.out.println("Nome: "+this.nomeProduto);
        System.out.println("Valor: " +this.valor);
        System.out.println("Quantidade: " +this.quantidade);
        System.out.println("\n");
        verficarDisponibilidade();
    }
    public int verficarDisponibilidade(){
        if(quantidade<=0){
            System.out.println("Produto indisponível ");
            return 0;
        }
        else{
            System.out.println("Produto disponível!");
            return 1;
        }
    }
    public void removerProdutos(int quantidade1){
       int var_return = verficarDisponibilidade();

        if(var_return == 0){
            System.out.println("Não há produtos para remover ");
            //quantidade-=quantidade1;
        }else{
            //System.out.println("Não há produtos para remover ");
            quantidade-=quantidade1;
        }
    }
}
