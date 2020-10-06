import javax.swing.*;
import java.awt.*;
public class Chap5Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame win;
		Container contenPane;
		Graphics g;
		
	    win =new JFrame("This is My Rectangle");
		win.setSize(500,300);
		win.setLocation(500,500);
		win.setVisible(true);
		
		contenPane=win.getContentPane();
		g=contenPane.getGraphics();
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
			
		g.drawRect(50, 50, 100, 30);
		

	}

}
