package com.faculdade.faculdade.resources;

import com.faculdade.faculdade.entities.Aluno;
import com.faculdade.faculdade.services.FaculdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.*;
import java.net.URI;
import java.util.List;
/**
 * endpoint raiz da minha aplicação
 */
@CrossOrigin(origins = "*", maxAge = 33600)
@RestController
@RequestMapping(value = "/faculdade")
public class FaculdadeResource {
    @Autowired
    private FaculdadeService faculdadeService;

    /**
     * consulta os alunos por RA(ID)     *
     */
    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findByRA(@PathVariable Integer id) {
        Aluno aluno = faculdadeService.findById(id);
        return ResponseEntity.ok().body(aluno);
    }

    /**
     * lista todos alunos ativos
     */
    @GetMapping(value ="/abertos")
    public ResponseEntity<List<Aluno>> listarAbertos(){
        List<Aluno> alunos = faculdadeService.listarTodosAbertos();
        return ResponseEntity.ok().body(alunos);
    }
    //lista todos alunos inativos
    @GetMapping(value ="/fechados")
    public ResponseEntity<List<Aluno>> listarFechados(){
        List<Aluno> alunos = faculdadeService.listarFechados();
        return ResponseEntity.ok().body(alunos);
    }

    /**
     * lista todos registros
     */
    @GetMapping
    public List<Aluno> findAll(){
        List<Aluno> aluno = faculdadeService.findAll();
        return aluno;
    }
    /**
     * Consulta por nome
     */
    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Aluno> findByNome(@PathVariable String nome){
        Aluno aluno = faculdadeService.findByNome(nome);
        return ResponseEntity.ok().body(aluno);
    }

    @GetMapping(value = "/nomeParcial/{nome}")
    public List <Aluno> findByParteNome(@PathVariable String nome){
        List <Aluno> alunos = faculdadeService.findByParteNome(nome);
        return alunos;
    }

    /**
     * Cadastro um registro
     */
    @PostMapping
    public ResponseEntity<Aluno> gravarAluno(
            @RequestBody Aluno aluno){
//        System.out.print("\n\n\n" + aluno.getCep() + "\n\n\n");
        aluno = faculdadeService.gravarAluno(aluno);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{ra}").
                buildAndExpand(aluno.getRa()).toUri();
        return ResponseEntity.created(uri).body(aluno);
    }

    /**
     * Apagando um registro
     * @param ra
     * @return
     */
    @DeleteMapping(value = "/{ra}")
    public ResponseEntity<Void> deletar(@PathVariable Integer ra){
        faculdadeService.deletar(ra);
        return ResponseEntity.noContent().build();
    }
    /**
     * Alterando um registro
     */
    @PutMapping(value = "/{ra}")
    public ResponseEntity<Aluno> update(@PathVariable Integer ra,
                                        @RequestBody Aluno aluno){
        Aluno alterado = faculdadeService.update(ra, aluno);
        return ResponseEntity.ok().body(alterado);
    }
}

