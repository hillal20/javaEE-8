package entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	
	String name;
	
	@ManyToMany
	@JoinTable(
			name="Projects_Managers",
	        joinColumns = @JoinColumn(name ="project_id"),
	        inverseJoinColumns = @JoinColumn(name = "manager_id"))
	Collection <Manager> managers  = new ArrayList<>();

	

	/////////////////////////////////////////////
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Manager> getManagers() {
		return managers;
	}

	public void setManagers(Collection<Manager> managers) {
		this.managers = managers;
	}
}
