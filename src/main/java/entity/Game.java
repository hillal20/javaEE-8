package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Game {

	@Id
	@SequenceGenerator(name = "gameSequenceGenerator", sequenceName = "gameSequence"  ) // to control the generation of primeryKey	
    @GeneratedValue(generator = "gameSequenceGenerator" ) // 
	Long id;
	
	private String name;
 }
