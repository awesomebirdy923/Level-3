package com.league.level3.classroom;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RosettaStone implements MouseListener{
	
	HashMap<String, String> languages = new HashMap<String, String>();
	JButton translateButton;
	public RosettaStone(){
		languages.put("Utilice", "Use");
		languages.put("un", "a");
		languages.put("HashMap", "HashMap");
		languages.put("para", "to");
		languages.put("almacenar", "store");
		languages.put("une", "an"); //Cuz "a" was taken.
		languages.put("diccionario", "dictionary");
		languages.put("de", "of");
		languages.put("quince", "fifteen");
		languages.put("parabras", "words");
		languages.put("en", "in");
		languages.put("Espanol", "Spanish");
		languages.put("y", "and");
		languages.put("con", "with");
		languages.put("Ingles", "English");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		translateButton = new JButton(getRandomKey(languages));
		translateButton.addMouseListener(this);
		panel.add(translateButton);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
	
	public static void main(String[] args) {
		new RosettaStone();
	}
	
	String getRandomKey(HashMap<String, String> map) {
		String[] keysAsArray = map.keySet().toArray(new String[0]);
		int randomness = new Random().nextInt(map.size());
		return keysAsArray[randomness];
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		translateButton.setText(languages.get(translateButton.getText()));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		translateButton.setText(getRandomKey(languages));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
