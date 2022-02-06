package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uz.pdp.entity.User;

@Repository
public interface UserReposirory extends JpaRepository<User, Integer> {

	boolean existsByFristNameAndLastNameOrPhonNumber(String fristName, String lastName, String phonNumber);
}
