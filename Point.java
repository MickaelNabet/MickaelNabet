package fr.dauphine.javaavance.td1;
import java.util.ArrayList;


public class Point {

	private int x;
	private int y;
	static int nbPoints;
	private static String p2;
	
	//Compteur du nombre de points créés
	{
		nbPoints++;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;
		Point.p2 = "("+x+","+y+")";
	}
	

	public String toString() {
		return "("+x+","+y+")";
	}

	@Override
	public boolean equals(Object o) {
		Point k = (Point)o;
		return this.x==k.x && this.y==k.y;
	}
	
	public boolean IsSameAs(Point p) {
		boolean b=true;
		if(p.x==this.x && p.y==this.y) {
			b=true;
		}else {
			b=false;
		}
		return b;
	}

	public static void main(String[] args) {
		method();
		Point p = new Point(4, 3);
		Point p1 = new Point(1,2);
		System.out.println(p.IsSameAs(p1));
		System.out.println(nbPoints);
		
		
	}
	
	public static void method() {
		Point p = new Point(4, 3);
		System.out.println(p.x+" "+p.y);
		Point Point2 = new Point(p);
		//System.out.println(Point2.p2.toString());
		System.out.println(p2.toString()); //(4,3)
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		//System.out.println(p1==p2);
		//System.out.println(p1==p3);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));

	}
	public void translate(int dx, int dy) {
		this.x = dx;
		this.y = dy;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
