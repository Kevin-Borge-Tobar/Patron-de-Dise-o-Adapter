package org.formacion;
public class AdapterInternacionalMoneyOrganization extends  BancoNostrumIml implements  InternationalMoneyOrganization{
	protected InternationalMoneyOrganization OrganizacionInternacional;
	protected BancoNostrumIml BankNacional;
	//private final Map<String, Integer> baseDatosClientes = new HashMap<>();
	
	
	@Override
	public void transfer(int cantidad, String cliente) {
	 this.movimiento(cliente, cantidad);
		
	}
	@Override
	public int state(String cliente) {
		Integer estadoActual = estado(cliente);
		if(cliente=="No_existo") {
			return 0;
		}
		return estadoActual;
	}
	
	


}
