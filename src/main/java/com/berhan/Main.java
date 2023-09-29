package com.berhan;

import com.berhan.Enums.EBrans;
import com.berhan.repository.entity.KisiselBilgiler;
import com.berhan.repository.entity.Ogrenci;
import com.berhan.repository.entity.Ogretmen;
import com.berhan.repository.entity.Sinif;
import com.berhan.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = HibernateUtility.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Ogretmen ogretmen =  Ogretmen.builder()
                .brans(EBrans.BIYOLOJI)
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .tcKimlikNo("12345646577")
                        .soyisim("asdasd")
                        .isim("asdasdasd")
                        .build())
                .date(LocalDate.of(2020,02,1))
                .build();
        session.save(ogretmen);
//        Ogrenci ogrenci = Ogrenci.builder()
//                .d_tarihi(LocalDate.of(2020,05,06))
//                .isim("hasan")
//                .soyisim("balıkcı")
//                .tcKimlikNo("77777777777")
//                .build();

        KisiselBilgiler kisiselBilgiler = new KisiselBilgiler();
        Ogrenci ogrenci = Ogrenci.builder()
                .kisiselBilgiler(KisiselBilgiler.builder()
                        .isim("mehmet")
                        .soyisim("topcu")
                        .tcKimlikNo("12345687891")
                        .build())
                .build();
        session.save(ogrenci);

        Sinif sinif = Sinif.builder()
                .sinifAdi("hababam")
                .ogrenciler(List.of(ogrenci.getKisiselBilgiler().getIsim()))
                .ogretmenId(ogretmen.getId())
                .build();

        session.save(sinif);

        transaction.commit();
        session.close();

    }
}