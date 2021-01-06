package com.andersonfcz.citiesapi.country.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pais")
public class Country {
   @Id
   private long id;
   @Column(name = "nome")

   private String name;
   @Column(name = "nome_pt")
   private String portugueseName;

   @Column(name = "sigla")
   private String code;

   private int bacen;
}
