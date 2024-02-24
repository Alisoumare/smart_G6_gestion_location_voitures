package smart.mr.gestionVoiture.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Date;

public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateDebut;

    private Date dateFin;

    private double prixTotal;

    private int kilometrageParcouru;

    private String assurance;

    private String statut;

    @ManyToOne
    private User user;

    @ManyToOne
    private Voiture voiture;



}

