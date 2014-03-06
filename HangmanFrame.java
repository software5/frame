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

	// 记录难度
	private final static int SIMPLE = 1;
	private final static int MEDIUM = 2;
	private final static int HARD = 3;
	private int difficulty = SIMPLE;
	// 记录关数
	private int round = 1;

	public HangmanFrame() {
		setLayout(new BorderLayout());
		// 只有初始界面是可见的
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
		// 给5个按钮添加相应操作
		inceptionPanel.getStart().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final JFrame out = new JFrame();
				out.setLayout(new BorderLayout());
				JButton ok = new JButton("确定");
				ok.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				JButton cancel = new JButton("取消");
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
				JLabel message = new JLabel("           新建游戏存档将被覆盖");
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

		// 点击游戏设置，弹出SettingFrame
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

		// 点击退出游戏，则直接退出
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
