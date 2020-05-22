package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.LocutorioDAO;

import co.edu.campusucc.sd.modelos.Locutorio;

class LocutorioTest {

	@Test
	void testPersist() {
		LocutorioDAO dao = new LocutorioDAO();
		Locutorio lo = new Locutorio();

		lo.setEnviarGiro("giro enviado");
		lo.setIdLocutorio("0121");
		lo.setIdPais("201");

		try {
			dao.persist(lo);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}