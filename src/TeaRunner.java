import javax.swing.JOptionPane;

import Kettle.Water;

public class TeaRunner {
public static void main(String[] args) {
	String flavor =  JOptionPane.showInputDialog("What flavor of tea do you want?");
	TeaBag teabag = new TeaBag(flavor);
	Kettle kettle = new Kettle();
	Cup cup = new Cup();
	kettle.getWater();
	kettle.boil();
	Kettle.Water water = kettle.getWater();	
	cup.makeTea(teabag, water);
	

}
}
