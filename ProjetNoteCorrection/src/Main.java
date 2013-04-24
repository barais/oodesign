import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.ensai.gl.SimpleList;
import fr.ensai.gl.SimpleListDecorator;


public class Main {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		
		new Main().init().run();
		
	}
	
	List<String> l;

	Main init(){
		//l = new SimpleList<String>();
		l  = new SimpleListDecorator<String>(new ArrayList<String>());
		l.add("Test0");
		l.add("Test1");
		l.add("Test2");
		l.add("Test3");
		l.add("Test4");
		l.add("Test5");
		
		return this;

	}
	
	void run(){
		Iterator<String> it= l.iterator();
		while (it.hasNext()){
			l.add("New Test");
			System.out.println(it.next());
		}
		System.err.println(l.size());		
	}

}
