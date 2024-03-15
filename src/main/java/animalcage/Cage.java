package animalcage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage 
{
	@Autowired
	@Qualifier("cat")
	Animal animal;
	
	public void animalCage()
	{
		animal.animalSound();
	}
}
