import java.util.Scanner;

/**
 * 
 */

/**
 * @author Dell
 *
 */
public class LineComparison {
	
	Scanner input = new Scanner(System.in);
	int x1, y1, x2, y2;
	double lengthOfLine;
	
	public void getPoints() {
		System.out.println("Enter points of line with format of x1,y1,x2,y2");
		this.x1 = input.nextInt();
		this.y1 = input.nextInt();
		this.x2 = input.nextInt();
		this.y2 = input.nextInt();
	}
	
	public double calculateLengthOfLine() {
		double a = Math.pow(x2-x1 , 2);
		double b = Math.pow(y2-y1 , 2);
		double length = Math.sqrt(a+b);
		System.out.println("Length of line between points (" +x1+ "," +y1+ ") and (" +x2+ "," +y2+ ") = "+length);
		return length;
	}
	
	public void equalityOfLines(double length1,double length2) {
		if(length1==length2) {
			System.out.println("Both lines are equal");
		}
		else {
			System.out.println("Both lines are not equal");
		}
	}
	
	public void compareLines(double length1,double length2) {
		if(length1==length2) {
			System.out.println("Both lines are equal");
		}
		else if(length1<length2){
			System.out.println("First line is smaller than second line");
		}
		else{
			System.out.println("First line is greater than second line");
		}
	}
	
	public static void main(String[] args) {
		
		// Points for line number 1
		LineComparison lineObj1 = new LineComparison();
		lineObj1.getPoints();
		double lengthOfLine1 = lineObj1.calculateLengthOfLine();
		
		// Points for line number 2
		LineComparison lineObj2 = new LineComparison();
		lineObj2.getPoints();
		double lengthOfLine2 = lineObj2.calculateLengthOfLine();
		
		//Check equality of lines
		LineComparison lineObj3 = new LineComparison();
		lineObj3.equalityOfLines(lengthOfLine1,lengthOfLine2);
		
		
		//Compare length of two lines
		lineObj3.compareLines(lengthOfLine1,lengthOfLine2);
		
	}

}
