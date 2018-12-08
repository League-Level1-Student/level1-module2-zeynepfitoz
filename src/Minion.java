
public class Minion {

public Minion(String name, int eyes, String color, String master) {
this.name = name;
this.eyes =  eyes;
this.color = color;
this.master = master;
}
	private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
		String getName() {
			return name;
		}
		void setname(String Name) {
			name = Name;
		}
		int getEyes() {
			return eyes;
		}
		void seteyes(int Eyes) {
			eyes = Eyes;
		}
		String getColor() {
			return color;
		}
		void setcolor(String Color) {
			color = Color;
		}
		String getMaster() {
			return master;
		}
		void setMaster(String Master) {
			master = Master;
		}

}
