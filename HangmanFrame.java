package frame;

import javax.swing.JFrame;

import panel.InceptionPanel;

@SuppressWarnings("serial")
public class HangmanFrame extends JFrame {
	InceptionPanel inceptionPanel = new InceptionPanel();

	public HangmanFrame() {
		add(inceptionPanel);
		setSize(736, 456);
		setTitle("Hangman Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLayout(null);

	}

}
