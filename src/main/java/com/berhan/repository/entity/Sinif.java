package com.berhan.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tblsinif")
public class Sinif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String sinifAdi;

    Long ogretmenId;

    @ElementCollection
    List<String> ogrenciler;
}
