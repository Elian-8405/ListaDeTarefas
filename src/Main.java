import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaDeTarefa lista = new ListaDeTarefa();

        lista.adicionarTarefa(new Tarefa("Arrumar casa"));
        lista.adicionarTarefa(new Tarefa("Lavar roupa"));
        lista.adicionarTarefa(new Tarefa("Ir para academia"));
        lista.adicionarTarefa(new Tarefa("Ir para escolha"));
        lista.removerTarefa("Lavar roupa");
        lista.adicionarTarefa(new Tarefa("Comer acai"));
        lista.editarTarefa("Ir para escolha", "Estudar");
        lista.listarTarefas();
    }
}