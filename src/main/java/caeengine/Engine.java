package caeengine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine 
{
	@Value("500")
	private int engineHp;
	@Value("3")
	private int engineCylinderCount;
	
//	public Engine(int engineHp, int engineCylinderCount) {
//		super();
//		this.engineHp = engineHp;
//		this.engineCylinderCount = engineCylinderCount;
//	}

	@Override
	public String toString() {
		return "Engine [engineHp=" + engineHp + ", engineCylinderCount=" + engineCylinderCount + "]";
	}
	
	
	
}
