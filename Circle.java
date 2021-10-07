package fr.dauphine.javaavance.td1;

public class Circle {
	
	protected static int radius;
	private Point center;
	
	
	
	public Circle(Point p, int rad) {
		this.radius = rad;
		this.center = new Point(p);
	}
	
	//Question 3/7
	public String toString() {
		return "Le Cercle a pour radius, "+this.radius+" pour centre "+this.center+" et pour aire "+this.area()+".";
	}
	
	 //@Override utilisé pour définir une méthode qui est héritée de la classe parente
	
	//Question 4 
	public void translate(int dx, int dy) {
		this.center.translate(dx, dy);
	}
	
	// Question 6
	public Point getCenter() {
		return this.center;
	}
	
	//Question 7	
	public double area() {
		return (Math.PI * Math.pow(radius, radius));
	}
	
	//Question 8
	public boolean contains(Point p) {
		boolean bool;
		if(Math.sqrt(Math.pow(p.getX()-this.center.getX(),2) + Math.pow(p.getY()-this.center.getY(),2))<this.radius) {
			bool = true;
		}else {
			bool = false;
		}
		return bool;
		
	}
	
	//Question 9
	public boolean contains(Point p, Circle c) {
		boolean bool = false;
		if(c.contains(p)) {
			bool = true;
		}
		return bool;		
	}
	
	public static void main(String[] args) {
		Point p=new Point(1,2);
		Circle c = new Circle(p,1);
		Circle c2 = new Circle(p,2);
		c2.translate(1,3);
		System.out.println(c+" "+c2); 
		
		/*Question5 : ça fonctionne car on met New Point dans le constructeur Circle, ce qui réinitialise les coordonnées du point p. 
	 	ne nous donne pas deux translations pour c et c2.*/
		
		Circle c1=new Circle(new Point(1,2), 1);
		c1.getCenter().translate(1, 1);
		System.out.println(c1);
		System.out.println(c1.area());
		System.out.println(c1.contains(p)); //test de contains		
		
	}
	
	public int getRad() {
		return this.radius;
	}



}
