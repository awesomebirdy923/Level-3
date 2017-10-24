package fileIO;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Solution4 {
private JFrame frame = new JFrame();
private JPanel panel = new JPanel();
private JButton add = new JButton("Add");
private JButton remove = new JButton("Remove");
private JButton save = new JButton("Save");
private JButton load = new JButton("Load");

public Solution4() {
	panel.add(add);
	panel.add(load);
	panel.add(remove);
	panel.add(save);
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.pack();
}

public static void main(String[] args) {
	new Solution4();
}

}
