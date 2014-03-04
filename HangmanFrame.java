package frame;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import panel.InceptionPanel;

@SuppressWarnings("serial")
public class HangmanFrame extends JFrame {
	InceptionPanel inceptionPanel = new InceptionPanel();
	private ImageIcon picture = new ImageIcon("yellowHang.jpg");
	private JLabel background = new JLabel(picture);

	public HangmanFrame() {
		add(background);
		setSize(736, 490);
		setTitle("Hangman Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);

		add(inceptionPanel, BorderLayout.SOUTH);
	}

}
