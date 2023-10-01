package com.berhan.repository.entity;

import com.berhan.Criteria.Methods;
import com.berhan.Enums.EBrans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 *3- Ogretmen entity olusturalim.
 *     id
 *     isim (null olamaz max 30 karakter)
 *     soyisim (null olamaz max 30 karakter)
 *     tcKimlikNo (null olamaz, unique, 11 karakter)
 *     brans (ENumarated) (Matematik, Fizik, Kimya, Biyoloji, Edebiyat)
 *     iseBaslamaTarihi (LocalDate olsun, null olamaz. Hicbir atama yapilmazsa simdinin tarihi gitsin.)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tblogretmen")
public class Ogretmen  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Embedded
    KisiselBilgiler kisiselBilgiler;

    @Enumerated(EnumType.STRING)
    EBrans brans;

    @Column(nullable = false)
    @Builder.Default
    LocalDate date=LocalDate.now();

}
