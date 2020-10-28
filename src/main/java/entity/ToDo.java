package entity;

import java.time.LocalDate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.json.bind.annotation.JsonbDateFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id ;
	
	@NotEmpty(message = "task can not be empty")
	@Size(min = 10, message = "min size is 10 chars")
	private String task;
	
	
	private LocalDate dateCreated;
	private boolean isCompleted;
	
	@NotNull(message = "date can not be null")
	@FutureOrPresent(message = "date is now or in the future")
	@JsonbDateFormat(value = "yyyy-MM-dd")
	private LocalDate dueDate;
	
	
	private LocalDate datedCompleted;
	
	
	@PostConstruct // callback hook 
	private void print() {
		System.out.println("==== post construct hook =====");
	}
	
	@PreDestroy // callback hook
	private void printS() {
		System.out.println("==== pre destroy  hook =====");
	}
	
	@PrePersist // callback hook 
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
