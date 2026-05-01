package com.example.mapa.controller;

import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // SETTERS
    @Setter
    private double latitude;
    @Setter
    private double longitude;
    @Setter
    private String tipo;
    @Setter
    private String icone;
    @Setter
    private LocalDateTime data;

    // 🔥 CONSTRUTOR VAZIO (OBRIGATÓRIO)
    public Ocorrencia() {}

    // GETTERS
    public Long getId() { return id; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }
    public String getTipo() { return tipo; }
    public String getIcone() { return icone; }
    public LocalDateTime getData() { return data; }

}