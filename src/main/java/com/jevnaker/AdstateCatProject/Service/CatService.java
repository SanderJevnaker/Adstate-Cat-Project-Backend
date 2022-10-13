package com.jevnaker.AdstateCatProject.Service;

import com.jevnaker.AdstateCatProject.Factory.CatFactory;
import com.jevnaker.AdstateCatProject.DTO.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CatService {

    @Autowired
    private CatFactory catFactory;


    public CatDTO getRandomCat() {
        return catFactory.createRandomCat();

    }

}
