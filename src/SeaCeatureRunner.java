
public class SeaCeatureRunner {
public static void main(String[] args) {
	 SeaCreature bob =  new SeaCreature("SpongeBob");
	 SeaCreature star =  new SeaCreature("Patrick");
	 SeaCreature squid =  new SeaCreature("Squidward");
	

	System.out.println(bob.getName());
	 System.out.println(star.getName());
	 System.out.println(squid.getName());
	 star.eat();
	 bob.laugh();
	 
}
}
