package entity;


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Manager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
	
	String name;
	
	@ManyToMany(mappedBy="managers")
	Collection <Project> projects = new ArrayList<>();
	
	
	
	
	
	
   /////////////////////////////////////////////////////////

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Project> getProjects() {
		return projects;
	}

	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}
	
	
	
}
