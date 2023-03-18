package br.com.wholesale.domain;

import java.time.LocalDate;

// Pessoa Fisica
public class PhysicalPerson extends PersonBase {

    // Cpf
    private String cpf;

    // Rg
    private String rg;

    // Sexo
    private String gender;

    // Raça
    private String race;

    // Nacionalidade
    private String nationality;

    // Naturalidade
    private String naturalness;

    // Nome do pai
    private String fatherName;

    // Nome da mae
    private String motherName;

    // get e sets
    public String getCpf() {
        return cpf;
    }

    // Gets e Sets

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRaca() {
        return race;
    }

    public void setRaca(String race) {
        this.race = race;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNaturalness() {
        return naturalness;
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    // Construtor
    public PhysicalPerson(int codPessoa, String name, String email, String site, LocalDate dateInclusion, String cpf,
            String rg, String gender, String race, String nationality, String naturalness, String fatherName,
            String motherName) {
        super(codPessoa, name, email, site, dateInclusion);
        this.cpf = cpf;
        this.rg = rg;
        this.gender = gender;
        this.race = race;
        this.nationality = nationality;
        this.naturalness = naturalness;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    @Override
    public void Imprimir() {
        System.out.println("codPessoa = " + this.personCode);
        System.out.println("name = " + this.name);
        System.out.println("email = " + this.email);
        System.out.println("site = " + this.site);
        System.out.println("dateInclusion = " + this.dateInclusion);
        System.out.println("cpf = " + this.cpf);
        System.out.println("rg = " + this.rg);
        System.out.println("gender = " + this.gender);
        System.out.println("race = " + this.race);
        System.out.println("nationality = " + this.nationality);
        System.out.println("naturalness = " + this.naturalness);
        System.out.println("fatherName = " + this.fatherName);
        System.out.println("motherName = " + this.motherName);

    }

    @Override
    public String toString() {
        return "PhysicalPerson [cpf=" + cpf + ", rg=" + rg + ", gender=" + gender + ", race=" + race + ", nationality="
                + nationality + ", naturalness=" + naturalness + ", fatherName=" + fatherName + ", motherName="
                + motherName + "]";
    }

}
