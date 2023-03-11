package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codPessoa;

    protected String name;

    protected String email;

    protected String site;

    protected LocalDate dataInclusao;

    public int getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(int codPessoa) {
        this.codPessoa = codPessoa;
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

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public BasePessoa(int codPessoa, String name, String email, String site, LocalDate dataInclusao) {
        this.codPessoa = codPessoa;
        this.name = name;
        this.email = email;
        this.site = site;
        this.dataInclusao = dataInclusao;
    }

}
