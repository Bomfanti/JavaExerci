package O_O_2;

public class Acampamento {
    String nome;
    char equipe;
    int idade;


    public void imprimir() {
        System.out.println("------------------------");
        System.out.println(nome);
        System.out.println(equipe);
        System.out.println(idade);
        System.out.println("------------------------\n");
    }

    public void separarGrupo(){
        if(idade >=6 && idade <11){
            this.equipe = 'A';
        }
        if(idade >10 && idade < 21 ){
            this.equipe = 'B';
        }else {
            this.equipe = 'C';   //Da pra excluir esse else, e na declaração da equipe deixar como toda equipe criada como 'c'
        }
    }
}
