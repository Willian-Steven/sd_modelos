package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelos.Pais;

class PaisTest {

	@Test
	void testPersist() {

		PaisDAO dao = new PaisDAO();
		Pais pa = new Pais();

		pa.setNombrePais("Colombia");
		pa.setIdPais("12");
		try {
			dao.persist(pa);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}
