package pl.doliszny.newspointsimplewebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.doliszny.newspointsimplewebapp.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


}
