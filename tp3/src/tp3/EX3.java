package tp3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class EX3 extends JFrame{
	JLabel label,label2;
	
	public EX3(){
//le jframe
		this.setTitle("execice3");
		this.setSize(300, 200);
		this.setLayout(new FlowLayout());
		this.init();
		this.getContentPane().add(label);
		this.getContentPane().add(label2);
		
//ACTION SUR LE PANE 
		this.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				label.setText("Action Clic souris X : "+e.getX()+" Y : "+e.getY()+" nb Click : "+e.getClickCount());
				label2.setText((e.getButton()== MouseEvent.BUTTON1)? "Gauche" : (e.getButton() == MouseEvent.BUTTON2)? "Centre":"Droite");
			}
			public void mouseEntered(MouseEvent arg0) {
				
			}
			public void mouseExited(MouseEvent arg0) {
				
			}
			public void mousePressed(MouseEvent e) {
				label.setText("Action Appui souris X : "+e.getX()+" Y : "+e.getY());
			}
			public void mouseReleased(MouseEvent e) {
				label.setText("Action Relacher souris X : "+e.getX()+" Y : "+e.getY());
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	//action sur le label
	void init(){
		label = new JLabel("Label");
	    label.setForeground(Color.red);
		label.setPreferredSize(new Dimension(250,40));
		label.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {
				
			}
			public void mouseEntered(MouseEvent arg0) {
				label.setForeground(Color.BLUE);
			}
			public void mouseExited(MouseEvent arg0) {
				label.setForeground(Color.green);
			}
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		label2 = new JLabel("");
		label2.setPreferredSize(new Dimension(250,40));
	}

	public static void main(String[] args) {
		EX3 app = new EX3();

	}

}