package entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id ;
	
	
	private String task;
	private LocalDate dateCreated;
	private boolean isCompleted; 
	private LocalDate dueDate;
	private LocalDate datedCompleted;
	
	
	@PrePersist
	private void init() {
		setDateCreated(LocalDate.now());
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getDatedCompleted() {
		return datedCompleted;
	}
	public void setDatedCompleted(LocalDate datedCompleted) {
		this.datedCompleted = datedCompleted;
	}
	
	
	
}
