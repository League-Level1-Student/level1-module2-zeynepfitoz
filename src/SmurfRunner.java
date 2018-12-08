
public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	Smurf smurfette = new Smurf("Smurfette");
	Smurf papa = new Smurf("Papa");
	System.out.println(handy.getName());
	handy.eat();
	System.out.println(smurfette.getName());
	System.out.println(papa.getName());
	System.out.println(papa.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
