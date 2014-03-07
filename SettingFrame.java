package frame;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class SettingFrame extends JFrame {
	private JLabel message = new JLabel("                请选择游戏难度");
	private JRadioButton jrbSimple, jrbMedium, jrbHard;
	private JButton ok = new JButton("确定");

	int a, b, c = 0;

	public SettingFrame() {
		setLayout(new BorderLayout());

		JPanel rbuttons = new JPanel();
		rbuttons.setLayout(new GridLayout(1, 3));
		rbuttons.add(jrbSimple = new JRadioButton("简单"));
		rbuttons.add(jrbMedium = new JRadioButton("中等"));
		rbuttons.add(jrbHard = new JRadioButton("困难"));

		ButtonGroup radiobuttons = new ButtonGroup();
		radiobuttons.add(jrbSimple);
		radiobuttons.add(jrbMedium);
		radiobuttons.add(jrbHard);
		jrbSimple.setSelected(true);

		add(message, BorderLayout.NORTH);
		add(rbuttons, BorderLayout.CENTER);
		add(ok, BorderLayout.SOUTH);

		setSize(200, 150);
		setResizable(false);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);

		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		jrbSimple.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				a = 1;
			}
		});
		jrbMedium.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				b = 1;
			}
		});
		jrbHard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				c = 1;
			}
		});
	}

	public JRadioButton getJrbSimple() {
		return jrbSimple;
	}

	public void setJrbSimple(JRadioButton jrbSimple) {
		this.jrbSimple = jrbSimple;
	}

	public JRadioButton getJrbMedium() {
		return jrbMedium;
	}

	public void setJrbMedium(JRadioButton jrbMedium) {
		this.jrbMedium = jrbMedium;
	}

	public JRadioButton getJrbHard() {
		return jrbHard;
	}

	public void setJrbHard(JRadioButton jrbHard) {
		this.jrbHard = jrbHard;
	}

	public boolean jrbSimpleIsSelected() {
		if (a == 1)
			return true;
		else
			return false;
	}

	public boolean jrbMediumIsSelected() {
		if (b == 1)
			return true;
		else
			return false;
	}

	public boolean jrbHardIsSelected() {
		if (c == 1)
			return true;
		else
			return false;
	}

}
