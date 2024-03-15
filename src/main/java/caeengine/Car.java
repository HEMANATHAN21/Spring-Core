package caeengine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car 
{
	@Value("197230")
	private int carNo;
	@Value("Honda")
	private String carBrand;
	@Value("Civic")
	private String carModelName;
	@Value("1000000")
	private double carPrice;
	@Autowired
	private Engine carEngine;
	
//	public Car(int carNo, String carBrand, String carModelName, double carPrice, Engine carEngine) {
//		super();
//		this.carNo = carNo;
//		this.carBrand = carBrand;
//		this.carModelName = carModelName;
//		this.carPrice = carPrice;
//		this.carEngine = carEngine;
//	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carBrand=" + carBrand + ", carModelName=" + carModelName + ", carPrice="
				+ carPrice + ", carEngine=" + carEngine + "]";
	}
	
	
	
}
