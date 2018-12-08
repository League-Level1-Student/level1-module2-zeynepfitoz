import javax.swing.JOptionPane;

public class TeaRunner {
public static void main(String[] args) {
	String flavor =  JOptionPane.showInputDialog("What flavor of tea do you want?");
	Teabag teabag = new Teabag(flavor);
}
}
