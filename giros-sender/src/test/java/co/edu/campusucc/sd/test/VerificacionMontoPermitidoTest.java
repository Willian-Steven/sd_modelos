package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.VerificacionMontoPermitidoDAO;

import co.edu.campusucc.sd.modelos.VerificacionMontoPermitido;

class VerificacionMontoPermitidoTest {

	@Test
	void testPersist() {
		VerificacionMontoPermitidoDAO dao = new VerificacionMontoPermitidoDAO();
		VerificacionMontoPermitido vmp = new VerificacionMontoPermitido();

		vmp.setGiro(null);
		vmp.setId(null);
		try {
			dao.persist(vmp);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}