package mailbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;



public class MailBox extends Observable{

	
	private MailBox(){
		
	}
	private static MailBox instance = null;
	
	
	public static MailBox getInstance() {
		if (instance==null)
			instance = new MailBox();
		return instance;
	}
	List<Mail> mail = new ArrayList<Mail>();
	
	
	public void addMail(Mail m ){
		
		this.mail.add(m);
		this.setChanged();
		this.notifyObservers();
	}


	public Mail getLastMail() {
		return this.mail.get(mail.size()-1);
	}


	public Integer getNbreMail() {
		return mail.size();
	}
	
	
	
}
