import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefa = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa = t;
                    break;
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
        tarefasSet.remove(tarefa);
    }

    public void marcarTarefaConcluida(String descricao) {
        Tarefa tarefa = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa = t;
                    tarefa.setConcluida(true);
                    break;
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefa = null;
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa = t;
                    tarefa.setConcluida(false);
                    break;
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (t.getConcluida()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa t : tarefasSet) {
                if (!t.getConcluida()) {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
        return tarefasPendentes;
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public void limparListaTarefas() {
        Set<Tarefa> tarefasParaRemover = new HashSet<>(tarefasSet);
        tarefasSet.removeAll(tarefasParaRemover);
    }
}
