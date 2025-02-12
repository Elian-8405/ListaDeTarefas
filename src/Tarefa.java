
public class Tarefa {

    private String nome;
    private int codigodaTarefa;
    private static int codigo = 0;

    public Tarefa(String nome){
        this.nome = nome;
        this.codigodaTarefa = codigo++;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo(){
        return codigodaTarefa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
