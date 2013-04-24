package mailbox;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class MailCounter extends JLabel implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		this.setText("nombre de mail : "+((MailBox)o).getNbreMail());
		System.out.println("passe par Update Counter");		
	}

	//TODO Should be notify
	
	
}
