package frame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RankFrame extends JFrame {
	private JPanel title = new JPanel();
	private JPanel content = new JPanel();
	private JLabel rank = new JLabel("����");
	private JLabel name = new JLabel("����");
	private JLabel round = new JLabel("ͨ������");
	private JLabel score = new JLabel("�÷�");
	private JButton ret = new JButton("����");

	// ����������Ҫһ��ArrayList<Info>

	public RankFrame() {
		setLayout(null);

		title.setLayout(new GridLayout(1, 4));
		title.add(rank);
		title.add(name);
		title.add(round);
		title.add(score);

		title.setBounds(10, 0, 250, 30);
		add(title);
		content.setBounds(10, 50, 250, 100);
		add(content);
		ret.setBounds(76, 130, 100, 30);
		add(ret);

		setSize(250, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);
		setTitle("��Ϸ����");

		ret.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}
}
