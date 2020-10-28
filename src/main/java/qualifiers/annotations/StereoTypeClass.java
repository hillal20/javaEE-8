package qualifiers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;


@Stereotype
@RequestScoped // this is the same as @RequestMapping in spring boot 
@Named // allows to access the private fields of a class inside the html pages 
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StereoTypeClass {
	// this annotation class is doing nothing because i am just using it as an example to show case
    // the annotation  stereotype is made to group the repeated annotations underneath it  in different classes
	// at this case if @RequestScoped and @Named are repeated in more then one class we could use 
	// @StereoTypeClass instead of @RequestScoped and @Named
}