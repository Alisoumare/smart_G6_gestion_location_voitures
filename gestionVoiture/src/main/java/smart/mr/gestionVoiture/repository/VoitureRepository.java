package smart.mr.gestionVoiture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smart.mr.gestionVoiture.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {


}
