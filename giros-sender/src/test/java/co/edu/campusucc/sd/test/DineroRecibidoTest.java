package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.DineroRecibidoDAO;

import co.edu.campusucc.sd.modelos.DineroRecibido;


class DineroRecibidoTest {

	@Test
	void testPersist() {
		DineroRecibidoDAO dao = new DineroRecibidoDAO();
		DineroRecibido dr = new DineroRecibido();

		dr.setDineroCantidad("500000");
		dr.setIdDineroIngresado("0011");
		dr.setNacionalidad("Cali");
		dr.setGiro(null);
		try {
			dao.persist(dr);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}