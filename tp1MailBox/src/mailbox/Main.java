package mailbox;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	private void init() {
		System.out.println("init");

		JFrame f = new JFrame();
		f.setTitle("Test de JFrame"); 
	    f.setSize(300,200); 
		
		JPanel p = new JPanel();
	    MailCounter count = new MailCounter();
		MailObserver obs = new MailObserver();
		f.add(p);
		p.add(count);
		p.add(obs);
		
		//TODO Register observer
		MailBox.getInstance().addObserver(count);
		MailBox.getInstance().addObserver(obs);
		
		
		f.setVisible(true);
		f.dispose();
		System.out.println("init");
		f.show();
		
		
		
	}
	private void runScenario() {
		
		MailBox.getInstance().addMail(new Mail("ensai", "tp fini"));
		System.out.println(MailBox.getInstance().getNbreMail());
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("init");
		Main m= new Main();
		m.init();
		while (true){
		Thread.sleep(3000);
		m.runScenario();
		}
	}
	

}
