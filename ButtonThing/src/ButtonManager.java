import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonManager implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JButton add;
	private JButton remove;
	private JButton view;

	private ArrayList<String> list = new ArrayList<String>();

	public ButtonManager() {
		frame = new JFrame();
		panel = new JPanel();
		add = new JButton("Add");
		remove = new JButton("Remove");
		view = new JButton("View");
		panel.add(add);
		panel.add(remove);
		panel.add(view);
		frame.setSize(400, 400);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		add.addActionListener(this);
		remove.addActionListener(this);
		view.addActionListener(this);
		frame.pack();
	}

	public static void main(String[] args) {
		new ButtonManager();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			String addPanel = JOptionPane.showInputDialog("Who would you like to add?");
			list.add(addPanel);
			System.out.println(list.toString());
		} else if (e.getSource() == remove) {
			String removePanel = JOptionPane.showInputDialog("Who would you like to remove?");
			list.remove(removePanel);
			System.out.println(list.toString());
		} else if (e.getSource() == view) {
			String total = "";
			for (int i = 0; i < list.size(); i++) {
				total += list.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, total);
		}
	}
}
