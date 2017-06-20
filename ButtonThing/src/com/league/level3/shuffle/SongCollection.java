package com.league.level3.shuffle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class SongCollection implements ActionListener {
	int tryMe = new Random().nextInt(4);
	ArrayList<Song> songNames = new ArrayList<Song>();

	public void addSong(String songName) {
		songNames.add(new Song(songName));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tryMe = new Random().nextInt(4);
		Song song = songNames.get(tryMe);
		for (Song songs : songNames) {
			songs.stop();
		}
		song.play();
	}
}
