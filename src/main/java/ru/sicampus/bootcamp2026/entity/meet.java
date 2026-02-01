package ru.sicampus.bootcamp2026.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "meet")
public class meet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "meet_date", nullable = false)
    private LocalDate meetDate;

    @Column(name = "meet_time", nullable = false)
    private LocalTime meetTime;
}