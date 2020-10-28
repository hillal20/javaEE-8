package qualifiers;

import qualifiers.annotations.ServiceMan;


// @ServiceMan(value = ServiceMan.ServiceType.Soldier) // qualifier takes 2 options 
@qualifiers.annotations.Soldier
public class Soldier implements Salute   {

	@Override
	public String salute(String nameOfSalute) {
		return "Soldier sslute ==> " + nameOfSalute;
	}

}
