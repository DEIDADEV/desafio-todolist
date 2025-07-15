package br.com.cezaraugusto.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cezaraugusto.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
