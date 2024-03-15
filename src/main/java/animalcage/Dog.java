package animalcage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal
{

	@Override
	public void animalSound() 
	{
		System.out.println("Dog Is Barking");
		
	}
	
}
