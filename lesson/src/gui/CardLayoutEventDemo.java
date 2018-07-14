package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutEventDemo extends JPanel implements ActionListener 
{   CardLayout card = new CardLayout(50, 50);     
    public CardLayoutEventDemo() 
    {    this.setLayout(card);
        JButton button;        
        for (int i = 1; i <= 3; i++) 
        {
              this.add(button = new JButton(" Press " + i), "Card" + i);
        }
    }    
    public void actionPerformed(ActionEvent e)//3.接口方法实现 
    {
        card.next(this); 
    }
    public static void main(String[] args) 
    {   JFrame frame = new JFrame("CardLayout示例");
        frame.setBounds(30, 30, 300, 300);        
        CardLayoutEventDemo cp = new CardLayoutEventDemo();
        frame.add(cp,BorderLayout.CENTER);        
        JButton btn = new JButton("next");
        btn.addActionListener(cp); //1.注册
        
        JPanel jp = new JPanel();
        jp.add(btn);
        frame.add(jp, BorderLayout.SOUTH);
                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }    
}

