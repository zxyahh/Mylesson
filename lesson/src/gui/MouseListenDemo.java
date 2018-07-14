package gui;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseListenDemo implements MouseMotionListener, MouseListener {
	private Frame f;
	private TextField tf;

	public static void main(String[] args) {
		MouseListenDemo ld = new MouseListenDemo();
		ld.go();
	}

	public void go() {
		f = new Frame("Two listeners example");
		f.add(new Label("Click and drag the mouse"), BorderLayout.NORTH);
		tf = new TextField(30);
		f.add(tf, BorderLayout.SOUTH);
		f.addMouseMotionListener(this);
		f.addMouseListener(this);
		f.setSize(300, 200);
		f.setVisible(true);
	}

	public void mouseDragged(MouseEvent e) {
		String s = "Mouse dragging: X = " + e.getX() + " Y = " + e.getY();
		tf.setText(s);
	}

	public void mouseEntered(MouseEvent e) {
		String s = "The mouse entered";
		tf.setText(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = "The mouse has left the building";
		tf.setText(s);
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}
