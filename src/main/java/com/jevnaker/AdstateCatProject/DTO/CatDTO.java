package com.jevnaker.AdstateCatProject.DTO;

public class CatDTO {

    private String breed;
    private String name;

    public CatDTO(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public CatDTO() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
