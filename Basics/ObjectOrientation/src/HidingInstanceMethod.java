public class HidingInstanceMethod {

	public static void main(String[] args) {
		
		Object p1 = new Point(10, 20);
		Object p3 = new Point(10, 20);
		
		System.out.println("p1 equals p3 is " + p1.equals(p3));
	}

}

class Point {

	private int xPos, yPos; 
 
	public Point(int i, int j) {
		this.xPos = i;
		this.yPos = j;
	}

	public boolean equals(Point other){
		if(other == null)
			return false;
		if( (xPos == other.xPos) && (yPos == other.yPos) )
			return true;
		else
			return false;
	}

} 
