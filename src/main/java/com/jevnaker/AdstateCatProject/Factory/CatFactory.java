package com.jevnaker.AdstateCatProject.Factory;

import com.jevnaker.AdstateCatProject.DTO.CatDTO;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CatFactory {

    private String[] breeds = new String[]{
            "Abyssinian",
            "Aegean",
            "Balinese",
            "Bombay",
            "British Shorthair",
            "Chartreux",
            "Maine Coon",
            "Pixie-Bo",
    };

    private String[] names = new String[]{
            "Axle",
            "Babbles",
            "Lucy",
            "Jake",
            "Zoe",
            "Lily",
            "Penny",
            "Wallace",
            "Stella",
            "Sarah"
    };

    public CatDTO createRandomCat() {
        CatDTO catDTO = new CatDTO();
        Random r = new Random();
        catDTO.setName(names[r.nextInt(names.length - 1)]);
        catDTO.setBreed(breeds[r.nextInt(breeds.length - 1)]);

        return catDTO;
    }
}
