import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, String> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        } else {
            throw new RuntimeException("Coleção está vazia");
        }
    }

    public String pesquisarPorNome(String nome) {
        String numero = null;
        if (!agendaContatosMap.isEmpty()) {
            numero = agendaContatosMap.get(nome);
        }
        return numero;
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }
}
