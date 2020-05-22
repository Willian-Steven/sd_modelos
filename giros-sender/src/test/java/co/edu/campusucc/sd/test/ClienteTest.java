package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import co.edu.campusucc.sd.daos.ClienteDAO;

import co.edu.campusucc.sd.modelos.Cliente;

class ClienteTest {

	@Test
	void testPersist() {
		ClienteDAO dao = new ClienteDAO();
		Cliente cl = new Cliente();

		cl.setIdCliente("15");
		cl.setNombres("Carlos");
		cl.setApellido("Diaz");
		cl.setRazonSocial("h");
		

		try {
			dao.persist(cl);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}
