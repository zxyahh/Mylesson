package gui;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutDemo {
	private Button bn,bs,bw,be,bc;
	public BoxLayoutDemo() {
	    JFrame frame = new JFrame("BoxLayout演示");
	    JPanel jPanel = new JPanel();
	    frame.add(jPanel,BorderLayout.EAST);
                 BoxLayout boxLayout = new 
                      BoxLayout(jPanel.getFocusCycleRootAncestor(),  BoxLayout.Y_AXIS);
	    frame.setLayout(boxLayout);
	    bn = new Button("north"); bs = new Button("south");
  	    be = new Button("east");	 bw = new Button("west");
                 bc = new Button("center");
	    frame.add(bn);	frame.add(bs);
	    frame.add(be);	frame.add(bw);
  	    frame.add(bc);            frame.pack();
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
             public static void main(String args[]) {new BoxLayoutDemo();}
}

