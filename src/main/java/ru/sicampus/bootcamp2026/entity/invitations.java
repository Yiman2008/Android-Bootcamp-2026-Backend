package ru.sicampus.bootcamp2026.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "invitations")
public class invitations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "meet_id", nullable = false)
    private meet meet;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private AppUserEntity user;
}