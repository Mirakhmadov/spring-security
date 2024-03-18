package uz.ustaxona.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.ustaxona.springsecurity.entity.User;


public interface UserRepo extends JpaRepository<User, Integer> {
}
