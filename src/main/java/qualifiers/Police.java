package qualifiers;


import qualifiers.annotations.ServiceMan;

//@ServiceMan(value=ServiceMan.ServiceType.Police) // qualifier shortcut takes Both Police or Soldier
@qualifiers.annotations.Police // applying the qualifier Police on Police class
public class Police implements Salute{

	@Override
	public String salute(String nameOfSalute) {
	
		return "Ploice slaute : "+ nameOfSalute;
	}
	

}
