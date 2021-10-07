package fr.dauphine.javaavance.td1;

import java.util.LinkedList;

//LinkedList représente une liste chaînée en java.

public class Polyline {

	private static LinkedList<Point> PolylineList = new LinkedList<Point>();
	
	public static void main(String[] args) {
		Point p = new Point(3,7);
		PolylineList.add(p);
		Point p1 = new Point(4,8);
		PolylineList.add(p1);
		Point p2 = new Point(2,7);
		PolylineList.add(p2);
		Point p3 = new Point(9,0);
		PolylineList.add(p3);
		System.out.println(PolylineList);
		System.out.println(pointCapacity());
	}
	
	//question 3/6
	public static int pointCapacity() {
		return PolylineList.size();
	}
	
	public int nbPoints() {
		int nb=0;
		for(int i = 0; i < PolylineList.size();i++) {
			if(!PolylineList.get(i).equals(null)) {
				nb++;
			}
		}
		return nb++;
	}
	
	//question 1
	public Polyline(LinkedList<Point> Points) {
		this.PolylineList = Points;
	}
	
	public void add(Point p) {
		for(int i = 0; i < PolylineList.size(); i++) {
			if(this.PolylineList.get(i).equals(null)) {
				this.PolylineList.add(p);
			}
		}
	}
	
	public boolean contains(Point p) {
		boolean bool=false;
		for(Point point : PolylineList) {
			if(point.IsSameAs(p)) {
				bool=true;
			}
		}
		return bool;
	}
	
}
