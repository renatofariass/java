import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        int numeroDeTarefas = tarefaList.size();
        return numeroDeTarefas;
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoesDasTarefas = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            descricoesDasTarefas.add(t.getDescricao());
        }

        return descricoesDasTarefas;
    }
}
