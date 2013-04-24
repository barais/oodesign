package mailbox;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

public class MailObserver extends JLabel implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		this.setText("subject : "+((MailBox)o).getLastMail().getSubject()+" body : " + ((MailBox)o).getLastMail().getBody());
		System.out.println("passe par Update MailObserver");

	}

}
