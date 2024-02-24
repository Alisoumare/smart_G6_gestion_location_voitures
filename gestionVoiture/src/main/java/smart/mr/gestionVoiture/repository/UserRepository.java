package smart.mr.gestionVoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.mr.gestionVoiture.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
