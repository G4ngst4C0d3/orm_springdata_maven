package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1;

public class Animal {
    private String nome_animal;
    private int idade_animal;
    private String sexo_animal;

    public Animal() {
    }

    public Animal(String nome_animal, int idade_animal, String sexo_animal) {
        this.nome_animal = nome_animal;
        this.idade_animal = idade_animal;
        this.sexo_animal = sexo_animal;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public int getIdade_animal() {
        return idade_animal;
    }

    public void setIdade_animal(int idade_animal) {
        this.idade_animal = idade_animal;
    }

    public String getSexo_animal() {
        return sexo_animal;
    }

    public void setSexo_animal(String sexo_animal) {
        this.sexo_animal = sexo_animal;
    }
    public String visualizar_animal(){
        return nome_animal;
    }
    public String conulta_Animal(){
        return nome_animal;
    }
}
