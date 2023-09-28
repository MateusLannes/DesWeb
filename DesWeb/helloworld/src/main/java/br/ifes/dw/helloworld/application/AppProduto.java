package br.ifes.dw.helloworld.application;
import java.util.ArrayList;
import java.util.List;
import br.ifes.dw.helloworld.model.Produto;
import org.springframework.stereotype.Component;

@Component
public  class AppProduto{

    private List<Produto> produtos = new ArrayList<Produto>();
    private long lastId = 0;

    public List<Produto> getAll(){
      return produtos;
    }

    public Produto create(Produto produto){
      lastId++;
      produto.setId(lastId);
      produtos.add(produto);
      return produto;
    }

    public void delete (long id) {
      this.produtos.removeIf(produto -> produto.getId() == id);
    }
    
  }
