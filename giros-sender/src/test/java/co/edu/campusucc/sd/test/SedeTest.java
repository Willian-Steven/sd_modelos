package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.SedeDAO;

import co.edu.campusucc.sd.modelos.Sede;

class SedeTest {

	@Test
	void testPersist() {
		SedeDAO dao = new SedeDAO();
		Sede se = new Sede();

		se.setIdSede("12312");
		se.setNombreSede("Puerto Asis");
		try {
			dao.persist(se);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}