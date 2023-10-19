package br.com.raionaradantas.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);

}

// public UserModel function findByUsername(String username) {
// var user = // pesq no banco pelo username
// return user;
// };