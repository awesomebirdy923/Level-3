import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class ConcatThing {
String[] stringArray = new String[4];
public ConcatThing(){
stringArray[0] = "Hi";
stringArray[1] = " Ho";
stringArray[2] = " Ko";
stringArray[3] = " Lo";
stringArray[4] = " Po";
String sum = "";
sum.concat(stringArray.toString());
}
}
