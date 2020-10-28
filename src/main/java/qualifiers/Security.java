package qualifiers;

import javax.inject.Inject;
import qualifiers.annotations.Soldier;
import qualifiers.annotations.Police;
import qualifiers.annotations.ServiceMan;

public class Security  {

	
	@Inject
	@Soldier // qualifier 
	//@ServiceMan(value=ServiceMan.ServiceType.Soldier) // qualifier
	private Salute soldierSalute;
	
	@Inject
	@Police // qualifier 
	//@ServiceMan(value=ServiceMan.ServiceType.Police)  //qualifier 
	private Salute policeSalute;
}
