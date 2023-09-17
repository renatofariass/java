public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Renato", "123456");
        agendaContatos.adicionarContato("Lucas", "5665");
        agendaContatos.adicionarContato("Renan", "1111111");
        agendaContatos.adicionarContato("Joao", "654987");
        agendaContatos.adicionarContato("Maria", "1111111");
        agendaContatos.adicionarContato("Camila", "44444");

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Renato"));
    }
}