package br.com.wholesale.domain;

import java.time.LocalDate;

public class LegalPerson extends PersonBase {

    // Cnpj
    private String cnpj;

    // Inscrição Estadual
    private String stateRegistration;

    // Inscrição Municipal
    private String municipalRegistration;

    // Nome Fantasia
    private String tradingName;

    // Gets e Sets
    public String getCnpj() {
        return cnpj;
    }

    // Gets e Sets
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(String stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public String getMunicipalRegistration() {
        return municipalRegistration;
    }

    public void setMunicipalRegistration(String municipalRegistration) {
        this.municipalRegistration = municipalRegistration;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public LegalPerson(int codPessoa, String name, String email, String site, LocalDate dateInclusion, String cnpj,
            String stateRegistration, String municipalRegistration, String nomeFantasia) {
        super(codPessoa, name, email, site, dateInclusion);
        this.cnpj = cnpj;
        this.stateRegistration = stateRegistration;
        this.municipalRegistration = municipalRegistration;
        this.tradingName = nomeFantasia;
    }

    @Override
    public void Imprimir() {

        System.out.println("cnpj = " + this.cnpj);
        System.out.println("stateRegistration = " + this.stateRegistration);
        System.out.println("municipalRegistration = " + this.municipalRegistration);
        System.out.println("nomeFantasia = " + this.tradingName);

    }

    @Override
    public String toString() {
        return "LegalPerson [cnpj=" + cnpj + ", stateRegistration=" + stateRegistration + ", municipalRegistration="
                + municipalRegistration + ", tradingName=" + tradingName + "]";
    }

}
