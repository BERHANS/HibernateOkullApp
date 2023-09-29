package com.berhan.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *  Bir ogrenci olusturalim
 *     id
 *     isim (null olamaz max 30 karakter)
 *     soyisim (null olamaz max 30 karakter)
 *     tcKimlikNo (null olamaz, unique, 11 karakter)
 *     dogumTarihi (LocalDate olsun, null olamaz. Hicbir atama yapilmazsa simdinin tarihi gitsin.)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tblogrenci")
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Embedded
    KisiselBilgiler kisiselBilgiler;

    @Column(nullable = false)
    @Builder.Default
    LocalDate d_tarihi=LocalDate.now();

}
