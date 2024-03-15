package useradhar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class User 
{
	@Value("1")
	private int id;
	@Value("Hema")
	private String name;
	@Value("123456789")
	private long contact;

	

//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setContact(long contact) {
//		this.contact = contact;
//	}
	
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}


//
//public User(int id, String name, long contact) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.contact = contact;
//}
	
	
}
