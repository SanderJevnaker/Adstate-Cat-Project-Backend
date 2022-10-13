package com.jevnaker.AdstateCatProject;

import com.jevnaker.AdstateCatProject.DTO.CatDTO;
import com.jevnaker.AdstateCatProject.Factory.CatFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdstateCatProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testCatFactory() {
		CatFactory catFactory = new CatFactory();
		CatDTO cat = catFactory.createRandomCat();
		System.out.println(cat.getBreed());
		System.out.println(cat.getName());
	}

}
