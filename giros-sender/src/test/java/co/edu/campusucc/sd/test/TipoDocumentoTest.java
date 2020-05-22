package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.TipoDocumentoDAO;

import co.edu.campusucc.sd.modelos.TipoDocumento;

class TipoDocumentoTest {

	@Test
	void testPersist() {
		TipoDocumentoDAO dao = new TipoDocumentoDAO();
		TipoDocumento td = new TipoDocumento();

		td.setIdTipoDocumento("01234");
		td.setNombreDocumento("Cedulula");

		try {
			dao.persist(td);
			assertTrue(true);

		} catch (Exception e) {

			fail(e.toString());

		}

	}

}