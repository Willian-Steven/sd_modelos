package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.TablaNegociacionDAO;

import co.edu.campusucc.sd.modelos.TablaNegociacion;

class TablaNegociacionTest {

	@Test
	void testPersist() {
		TablaNegociacionDAO dao = new TablaNegociacionDAO();
		TablaNegociacion tb = new TablaNegociacion();

		tb.setComicion("123123");
		tb.setDestino("Pasto");
		tb.setFlete("0.6");
		tb.setIdBanco("001345");
		tb.setIdComicion("0052");
		tb.setOrigen("Cali");
		tb.setVigenciaGiro("12/04/2020");
	
		try {
			dao.persist(tb);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}