import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaDeTarefa {
    private List<Tarefa> taskList;

    public ListaDeTarefa(){
        this.taskList = new ArrayList<>();
    }


    public void adicionarTarefa(Tarefa tarefa){
        if (tarefa != null){
            taskList.add(tarefa);
        }else{
            throw new RuntimeException();
        }

    }


    public void listarTarefas(){
        try {
            taskList.forEach(
                    tarefa -> System.out.println(
                            tarefa.getCodigo()+ "-" + tarefa.getNome() + "\n"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void editarTarefa(String nomeDaTarefa, String novoNome){
        if (nomeDaTarefa != null){
            taskList.forEach(tarefa -> {
                if(nomeDaTarefa.equalsIgnoreCase(tarefa.getNome())) {
                    tarefa.setNome(novoNome);
            }});
        }

    }



    public void removerTarefa(String nomeDaTarefa){
        if (nomeDaTarefa != null){
            taskList.removeIf(tarefa -> nomeDaTarefa.equalsIgnoreCase(tarefa.getNome()));
        }
    }








}
