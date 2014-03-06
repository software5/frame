package frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import panel.InceptionPanel;
import panel.PlayPanel;

@SuppressWarnings("serial")
public class HangmanFrame extends JFrame {
	private InceptionPanel inceptionPanel = new InceptionPanel();
	private PlayPanel playPanel = new PlayPanel(0, 0, 0, 0);

	// ��¼�Ѷ�
	private final static int SIMPLE = 1;
	private final static int MEDIUM = 2;
	private final static int HARD = 3;
	private int difficulty = SIMPLE;
	// ��¼����
	private int round = 1;

	public HangmanFrame() {
		setLayout(new BorderLayout());
		// ֻ�г�ʼ�����ǿɼ���
		add(inceptionPanel, BorderLayout.CENTER);
		inceptionPanel.setVisible(false);
		add(playPanel, BorderLayout.CENTER);
		playPanel.setVisible(true);

		setSize(736, 456);
		setTitle("Hangman Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLayout(null);

		initAction();
	}

	private void initAction() {
		// ��5����ť�����Ӧ����
		inceptionPanel.getStart().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JFrame out = new JFrame();
				out.setLayout(new BorderLayout());
				JButton ok = new JButton("ȷ��");
				ok.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				JButton cancel = new JButton("ȡ��");
				cancel.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						out.dispose();
					}
				});
				JPanel buttons = new JPanel();
				buttons.setLayout(new FlowLayout());
				buttons.add(ok);
				buttons.add(cancel);
				JLabel message = new JLabel("           �½���Ϸ�浵��������");
				out.add(message, BorderLayout.CENTER);
				out.add(buttons, BorderLayout.SOUTH);
				out.setSize(200, 100);
				out.setResizable(false);
				out.setLocationRelativeTo(null);
				out.setAlwaysOnTop(true);
				out.setVisible(true);
			}
		});

		inceptionPanel.getResume().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		inceptionPanel.getRank().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RankFrame out = new RankFrame();
			}
		});

		// �����Ϸ���ã�����SettingFrame
		inceptionPanel.getSetting().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SettingFrame out = new SettingFrame();
				out.getJrbSimple().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						difficulty = SIMPLE;
					}
				});
				out.getJrbMedium().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						difficulty = MEDIUM;
					}
				});
				out.getJrbHard().addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						difficulty = HARD;
					}
				});
			}
		});

		// ����˳���Ϸ����ֱ���˳�
		inceptionPanel.getExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	private void removePanel(JPanel panel) {
		panel.setVisible(false);
		remove(panel);

	}

}
