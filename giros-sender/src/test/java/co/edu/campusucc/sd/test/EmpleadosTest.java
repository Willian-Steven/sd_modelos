package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.EmpleadosDAO;
import co.edu.campusucc.sd.modelos.Empleados;



class EmpleadosTest {

	@Test
	void testPersist() {
		EmpleadosDAO dao = new EmpleadosDAO();
		
		Empleados em = new Empleados();

		em.setApellido("Giraldo");
		em.setIdEmpleado("020");
		em.setNombre("Miguel");
		em.setTipoDocumento("1122214755");
		try {
			dao.persist(em);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}