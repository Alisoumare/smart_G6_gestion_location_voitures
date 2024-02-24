package smart.mr.gestionVoiture.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String immatriculation;

    private String marque;

    private String modele;


    private int nbPlaces;

    private int anneeMiseCirculation;

    private int kilometrage;

    private String etat;

    private String categorie;
}
