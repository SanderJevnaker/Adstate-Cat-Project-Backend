package com.jevnaker.AdstateCatProject.Resource;

import com.jevnaker.AdstateCatProject.DTO.CatDTO;
import com.jevnaker.AdstateCatProject.Service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatResource {

    @Autowired
    private CatService catService;

    @CrossOrigin(origins = {"http://localhost:3000/", "http://194.32.107.29:3000"})
    @GetMapping("/randomcat")
    public ResponseEntity<CatDTO> getRandomCat() {

        return ResponseEntity.accepted().body(catService.getRandomCat());
    }

}
