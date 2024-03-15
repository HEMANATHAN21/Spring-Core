package animalcage;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal
{

	@Override
	public void animalSound() {
		System.out.println("Cat sound Is meow");
		
	}

}
