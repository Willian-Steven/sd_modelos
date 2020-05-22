package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.GiroDAO;

import co.edu.campusucc.sd.modelos.Giro;

class GiroTest {

	@Test
	void testPersist() {
		GiroDAO dao = new GiroDAO();
		Giro gi = new Giro();

		gi.setIdGiro("0110");
		gi.setIdAdministrador("031");

		try {
			dao.persist(gi);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}