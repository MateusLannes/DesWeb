package br.ifes.dw.helloworld.controller;


import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import br.ifes.dw.helloworld.model.Produto;
import br.ifes.dw.helloworld.application.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("produtos")

public class ProdutoController {

  @Autowired
  private AppProduto appProduto;
  
  private List<Produto> produtos = new ArrayList<Produto>();
  private int lastId = 0;
  
  @GetMapping("/")
  public List<Produto>getAll(){
    return appProduto.getAll();
  }

  @PostMapping("/")
  public Produto createProduto (@RequestBody Produto produto) {
      return appProduto.create(produto);

  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable long id){
    appProduto.delete(id);
  }
}