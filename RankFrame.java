package frame;

import java.awt.BorderLayout;
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
		setLayout(new BorderLayout());

		title.setLayout(new GridLayout(1, 4));
		title.add(rank);
		title.add(name);
		title.add(round);
		title.add(score);

		add(title, BorderLayout.NORTH);
		add(content, BorderLayout.CENTER);
		add(ret, BorderLayout.SOUTH);

		setSize(250, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);

		ret.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

	}

}
