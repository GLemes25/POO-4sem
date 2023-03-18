package br.com.wholesale.domain;

import java.time.LocalDate;

// Base Pessoa 
public abstract class PersonBase {

    // Codigo da pessoa
    protected int personCode;

    // Nome
    protected String name;

    // E-mail
    protected String email;

    // Site
    protected String site;

    // Data de Inclusao
    protected LocalDate dateInclusion;

    public int getPersonCode() {
        return personCode;
    }

    public void setPersonCode(int codPessoa) {
        this.personCode = codPessoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public LocalDate getDateInclusion() {
        return dateInclusion;
    }

    public void setDateInclusion(LocalDate dateInclusion) {
        this.dateInclusion = dateInclusion;
    }

    public PersonBase(int codPessoa, String name, String email, String site, LocalDate dateInclusion) {
        this.personCode = codPessoa;
        this.name = name;
        this.email = email;
        this.site = site;
        this.dateInclusion = dateInclusion;
    }

    public abstract void Imprimir();

}
