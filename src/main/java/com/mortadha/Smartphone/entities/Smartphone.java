package com.mortadha.Smartphone.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Smartphone {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idSmartphone;
private String nomSmartphone;
private Double prixSmartphone;
private Date dateCreation;
public Smartphone() {
super();
}
public Smartphone(String nomSmartphone, Double prixSmartphone, Date dateCreation) {
super();
this.nomSmartphone = nomSmartphone;
this.prixSmartphone = prixSmartphone;
this.dateCreation = dateCreation;
}
public Long getIdSmartphone() {
return idSmartphone;
}
public void setIdSmartphone(Long idSmartphone) {
this.idSmartphone = idSmartphone;
}
public String getNomSmartphone() {
return nomSmartphone;
}
public void setNomSmartphone(String nomSmartphone) {
this.nomSmartphone = nomSmartphone;
}
public Double getPrixSmartphone() {
return prixSmartphone;
}
public void setPrixSmartphone(Double prixSmartphone) {
this.prixSmartphone = prixSmartphone;
}
public Date getDateCreation() {
return dateCreation;
}
public void setDateCreation(Date dateCreation) {
this.dateCreation = dateCreation;
}
@Override
public String toString() {
return "Smartphone [idSmartphone=" + idSmartphone + ", nomSmartphone=" + 
nomSmartphone + ", prixSmartphone=" + prixSmartphone
+ ", dateCreation=" + dateCreation + "]";
}
}
