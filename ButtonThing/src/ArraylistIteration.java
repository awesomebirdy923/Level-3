import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraylistIteration {
	
class Pig{
	void feed(){
		System.out.println("OM NOM NOM");
	}
}
class Bubble{
	void pop(){
		System.out.println("POP");
	}
}
class Song{
	void sing(){
		System.out.println("I CAME IN LIKE A WRECKING BALLLLLLL!");
	}
}
class Ornament{
	String color;
	public Ornament(String color){
		this.color = color; 
	}
	String getColor(){
		return color;
	}
	void hang(){
		System.out.println("*Hangs " + color + " ornament*");
	}
}
public ArraylistIteration(){
	ArrayList<Pig> theYard = new ArrayList<Pig>();
	ArrayList<Bubble> bubbleWrap = new ArrayList<Bubble>();
	ArrayList<Song> playlist = new ArrayList<Song>();
	ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
	theYard.add(new Pig());
	theYard.add(new Pig());
	theYard.add(new Pig());
	bubbleWrap.add(new Bubble());
	bubbleWrap.add(new Bubble());
	bubbleWrap.add(new Bubble());
	playlist.add(new Song());
	boxOfDecorations.add(new Ornament("Red"));
	boxOfDecorations.add(new Ornament("Yellow"));
	boxOfDecorations.add(new Ornament("Green"));
	boxOfDecorations.add(new Ornament("Blue"));
	boxOfDecorations.add(new Ornament("Purple"));
	boxOfDecorations.add(new Ornament("Orange"));
	for (int i = 0; i < theYard.size(); i++) {
		Pig pig = theYard.get(i);
		pig.feed();
	}
	for (int i = 0; i < bubbleWrap.size(); i++) {
		Bubble bubble = bubbleWrap.get(i);
		bubble.pop();
	}
	for(Song song:playlist){
		song.sing();
	}
	for(Ornament ornament : boxOfDecorations){
		ornament.hang();
	}
}

public static void main(String[] args) {
	new ArraylistIteration();
}
}
