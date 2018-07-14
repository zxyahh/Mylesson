package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//聊天类，接口实现动作监听
public class ChatClient implements ActionListener {
	// 声明按钮
	JButton se, qu, cl;
	//声明文本域、文本框
	JTextArea texta;
	JTextField textf;
	//声明时间
	SimpleDateFormat time;

	// 方法启动
	public void launchFrame() {
		// 实例化frame
		JFrame frame = new JFrame("Chat Room");
		// 实例化一个panel
		JPanel jPanel = new JPanel();

		// 加入frame右侧
		frame.add(jPanel, BorderLayout.EAST);
		// 实例化一个panel
		JPanel jPanel2 = new JPanel();
		// 加入frame下部一个panel
		frame.add(jPanel2, BorderLayout.SOUTH);
		// 实例化一个文本框
		textf = new JTextField(20);
		// 实例化一个发送按钮
		se = new JButton("Send");
		// 发送按钮侦听
		se.addActionListener(this);
		// 实例化一个退出按钮
		qu = new JButton("Quit");
		// 退出按钮侦听
		qu.addActionListener(this);
		// 实例化清屏按钮
		cl = new JButton("Clear");
		// 清屏按钮监听
		cl.addActionListener(this);
		textf.addActionListener(this);
		// 实例化一个文本域
		texta = new JTextArea(50, 10);
		// 在frame下方加入文本框和发送按钮
		JLabel label = new JLabel("输入框");
		//下方加入label、文本框、发送按钮
		jPanel2.add(label,FlowLayout.LEFT);
		jPanel2.add(textf,FlowLayout.CENTER);
		jPanel2.add(se,FlowLayout.RIGHT);
		

		// 在frame右侧加入退出按钮
		jPanel.add(cl);
		jPanel.add(qu);
		JScrollPane sp = new JScrollPane(texta);
		// sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		// 在frame中心加入文本域并设置文本域大小400*400
		frame.add(sp, BorderLayout.CENTER);
		// frame容器设置400*400
		frame.setSize(400, 400);
		//实例化时间
		time = new SimpleDateFormat("HH:mm:ss");
		//实例化菜单条
		JMenuBar menuBar = new JMenuBar();
		//实例化菜单栏
		JMenu menuFile = new JMenu("文件");
		//设置快捷方式
		menuFile.setMnemonic('F');
		//菜单栏添加到菜单条
		menuBar.add(menuFile);
		//实例化菜单项目
		JMenuItem menuItem = new JMenuItem("打开");
		//菜单栏加入菜单条
		menuFile.add(menuItem);
		//菜单条加入frame
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);// 设置容器可见
	}

	public static void main(String[] args) {
		new ChatClient().launchFrame();// 调用launchFrame方法
	}

	public void actionPerformed(ActionEvent e)// 3.接口方法实现
	{
		//捕获到行为事件se或者textf
		if (e.getSource() == se || e.getSource() == textf) {
			System.out.print("进入");
			texta.append("time : "+time.format(new Date()) + "\n" + textf.getText() + "\n");
			textf.setText(null);
		} else if (e.getSource() == cl) {
			System.out.print("清屏");
			texta.setText(null);

		} else {
			System.out.println("退出");
			System.exit(0);
		}
	}

}
