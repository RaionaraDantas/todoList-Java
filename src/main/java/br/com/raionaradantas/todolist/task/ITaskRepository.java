package br.com.raionaradantas.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {
  List<TaskModel> findByIdUser(UUID idUser);
}

// extends JpaRepository<TaskModel, UUID>: Isso significa que ITaskRepository
// estende a interface JpaRepository, que é geralmente usada para realizar
// operações de persistência de dados em um banco de dados. Neste caso, a
// entidade principal que está sendo gerenciada é do tipo TaskModel, e o tipo da
// chave primária dessa entidade é UUID.

// List<TaskModel> findByIdUser(UUID idUser);: Este é um método definido na
// interface ITaskRepository. Ele representa uma operação de consulta para
// encontrar uma lista de objetos TaskModel com base no idUser, que é uma chave
// estrangeira para associar tarefas a um usuário específico. O método retorna
// uma lista de tarefas que atendem ao critério da consulta.
