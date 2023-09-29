package com.berhan.repository.entity;

import com.berhan.Enums.EBrans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class KisiselBilgiler {

    @Column(nullable = false,length = 30)
    String isim;
    @Column(nullable = false,length = 30)
    String soyisim;
    @Column(nullable = false,unique = true,length = 11)
    String tcKimlikNo;



}
