package br.unitins.biblioteca.livro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping
    List<Livro> pegarLivros(){
        return livroService.getLivros();
    }

    @PostMapping
    Livro salvarLivro(Livro livro){
        return livroService.criarLivro(livro);
    }
}
