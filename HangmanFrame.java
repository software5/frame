package frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import panel.InceptionPanel;
import panel.PlayPanel;

@SuppressWarnings("serial")
public class HangmanFrame extends JFrame {
	private InceptionPanel inceptionPanel = new InceptionPanel();
	private PlayPanel playPanel = new PlayPanel(6, 1, 1, 1);

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
		inceptionPanel.setVisible(true);
		// add(playPanel, BorderLayout.CENTER);
		// playPanel.setVisible(true);

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
		// ����½���Ϸ
		inceptionPanel.getStart().addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				final JFrame out = new JFrame();
				out.setLayout(new BorderLayout());
				JButton ok = new JButton("ȷ��");
				ok.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// if (inceptionPanel != null) {
						// inceptionPanel.setVisible(false);
						// remove(inceptionPanel);
						// }
						// playPanel.setVisible(true);
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

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// ���������Ϸ
		inceptionPanel.getResume().addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// �����Ϸ����
		inceptionPanel.getRank().addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				RankFrame out = new RankFrame();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// �����Ϸ���ã�����SettingFrame
		inceptionPanel.getSetting().addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				SettingFrame out = new SettingFrame();
				if (out.jrbSimpleIsSelected()) {
					difficulty = SIMPLE;
				}
				if (out.jrbMediumIsSelected()) {
					difficulty = MEDIUM;
				}
				if (out.jrbHardIsSelected()) {
					difficulty = HARD;
				}
				System.out.println(difficulty);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// ����˳���Ϸ����ֱ���˳�
		inceptionPanel.getExit().addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void removePanel(JPanel panel) {
		panel.setVisible(false);
		remove(panel);

	}

}
