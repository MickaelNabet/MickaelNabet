package fr.dauphine.javaavance.td1;

//On utilise la notion héritage en prenant pour classe mère Circle.
public class Ring extends Circle{
	
	private int rad2;
	
	public Ring(int rad, int rad2, Point p) {
		super(p, rad); // super en java est une variable de référence qui est utilisée pour référencer les objets de la classe parent.
		this.rad2 = rad2;
		if(rad>this.rad2) {
			System.out.println("Ce n'est pas valable.");
		}
	}
	
	public boolean equals(Ring r) {
		boolean bool = false;
		int rad22 = this.rad2;
		int rad1 = Circle.radius;
		if(r.equals(rad1) && r.equals(rad22)){
			bool = true;
		}
		return bool;
	}
	
	public static void main(String[] args){
		Point p1 = new Point(1,2);
		Ring first = new Ring(1,3,p1);
		Point p2 = new Point(6,2);
		Ring second = new Ring(1,2,p2);
		System.out.println(first.equals(second));
		
	}
	
}
