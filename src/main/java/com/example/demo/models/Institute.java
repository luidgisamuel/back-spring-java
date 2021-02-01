package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="TB_INSTITUTE")
public class Institute implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id  
  private String cnpj;

  private String name;

  private String address;

  private String phone;


  public Institute() {
  }

  public Institute(String cnpj, String name, String address, String phone) {
    this.cnpj = cnpj;
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
  
}
