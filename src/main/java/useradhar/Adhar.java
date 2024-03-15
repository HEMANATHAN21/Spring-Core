package useradhar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Adhar 
{
	@Value("1")
	private int id;
	@Value("Chengalpattu")
	private String city;
	@Value("987654321")
	private long adharNumber;
	@Autowired
	private User user;
	public int getId() {
		return id;
	}
//	public String getCity() {
//		return city;
//	}
//	public long getAdharNumber() {
//		return adharNumber;
//	}
//	public User getUser() {
//		return user;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public void setAdharNumber(long adharNumber) {
//		this.adharNumber = adharNumber;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	
	
	@Override
	public String toString() {
		return "Adhar [id=" + id + ", city=" + city + ", adharNumber=" + adharNumber + ", user=" + user + "]";
	}
//public Adhar(int id, String city, long adharNumber, User user) {
//	super();
//	this.id = id;
//	this.city = city;
//	this.adharNumber = adharNumber;
//	this.user = user;
//}
//	
	
}
