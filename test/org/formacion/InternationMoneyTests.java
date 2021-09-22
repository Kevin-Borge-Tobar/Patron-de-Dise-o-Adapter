package org.formacion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InternationMoneyTests {
	
	@Before
	public void init() {
		// cambia este null por una referencia al adapter que has creado
		 AdapterInternacionalMoneyOrganization servicio = new AdapterInternacionalMoneyOrganization();		
	}
	
	@Test
	public void test_cliente_no_existe() {
		 AdapterInternacionalMoneyOrganization servicio = new AdapterInternacionalMoneyOrganization();
		Assert.assertEquals(0,servicio.state("No_existo"));
	}

	@Test
	public void test_operaciones_con_nuevo_cliente() {
		 AdapterInternacionalMoneyOrganization servicio = new AdapterInternacionalMoneyOrganization();
		String cliente = "nuevo";
		servicio.transfer(100, cliente);
		Assert.assertEquals(100, servicio.state(cliente));
		servicio.transfer(-70, cliente);
		Assert.assertEquals(30, servicio.state(cliente));
	}
}
