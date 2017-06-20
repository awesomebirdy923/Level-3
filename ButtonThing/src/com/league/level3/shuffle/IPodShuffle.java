package com.league.level3.shuffle;

// Copyright The League of Amazing Programmers, 2015

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javazoom.jl.decoder.JavaLayerException;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

public class IPodShuffle {

	public static void main(String[] args) throws IOException, JavaLayerException {
		// 3. Find an mp3 on your computer or on the Internet.
		SongCollection collection = new SongCollection();
		// 4. Use the Song class below to instantiate a Song.

		collection.addSong("/Users/league/Downloads/camera_flash.mp3");
		collection.addSong("/Users/league/Downloads/Storm.mp3");
		collection.addSong("/Users/league/Downloads/?.mp3");
		collection.addSong("/Users/league/Downloads/RADDDDTUNEMANNNNNNN.mp3");
		collection.addSong("/Users/league/Downloads/WRRRRRRRRRM.mp3");

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton surpriseMe = new JButton("SURPRISE ME!");

		surpriseMe.addActionListener(collection);
		panel.add(surpriseMe);
		frame.add(panel);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();

		// 5. Play the Song to test that it works.

	}

	/**
	 * 6. Congratulations on completing the sound check!
	 * 
	 * Now we want to make an iPod Shuffle that plays random music.
	 * 
	 * Create an ArrayList of Songs and a "Surprise Me!" button that will play a
	 * random song when it is clicked.
	 * 
	 * If you're really cool, you can stop all the songs, before playing a new
	 * one on subsequent button clicks.
	 */
}
