package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.BiometriaDAO;


import co.edu.campusucc.sd.modelos.Biometria;


class BiometriaTest {

	@Test
	void testPersist() {
		BiometriaDAO dao = new BiometriaDAO();
		Biometria bio = new Biometria();

		try {
			dao.persist(bio);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}