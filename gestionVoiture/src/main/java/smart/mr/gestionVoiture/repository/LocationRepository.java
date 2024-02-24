package smart.mr.gestionVoiture.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import smart.mr.gestionVoiture.entities.Location;

public interface LocationRepository extends JpaRepository<Location,Long> {


}
