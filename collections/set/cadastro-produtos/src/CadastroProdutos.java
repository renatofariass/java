import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtosSet;


    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Comparator<Produto> produtoComparator = Comparator.comparing(Produto::getNome);
        Set<Produto> produtosOrdenados = new TreeSet<>(produtoComparator);
        if (!produtosSet.isEmpty()) {
            produtosOrdenados.addAll(produtosSet);
        } else {
            throw new RuntimeException("Não há elementos na lista");
        }
        return produtosOrdenados;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Comparator<Produto> produtoComparator = Comparator.comparingDouble(Produto::getPreco);
        Set<Produto> produtosOrdenados = new TreeSet<>(produtoComparator);
        if (!produtosSet.isEmpty()) {
            produtosOrdenados.addAll(produtosSet);
        } else {
            throw new RuntimeException("Não há elementos na lista");
        }
        return produtosOrdenados;
    }
}
