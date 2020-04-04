/**
* File Name: ReadShapeFile.java
* 
* <p> Purpose: This class reads a shape file
* 
* @date 2020-03-04 
* <p> Last modified: 2020-03-04
* @author Josen Pottackal
* - no copyright
* @version 1.0
*/

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {
	
	/**
	 * Scans line of textfile beginning with "circle"   
	 * and creates an instance of the circle object
	 * 
	 * @param in	
	 * 			  the scanner of the file
	 * @return an instance of the circle object
	 */
	public static Circle circle (Scanner in) {
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int diameter = in.nextInt();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		int insertionTime = in.nextInt();
				  
		Circle circle = new Circle(insertionTime, x, y, vx, vy, diameter, Color.rgb(r,g,b), isFilled);
		System.out.println(circle.toString());
		
		return circle;
	}
	
	/**
	 * Scans line of textfile beginning with "oval"   
	 * and creates an instance of the oval object
	 * 
	 * @param in	
	 * 			  the scanner of the file
	 * @return an instance of the oval object
	 */
	public static Oval oval (Scanner in) {
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int width = in.nextInt();
		int height = in.nextInt();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		int insertionTime = in.nextInt();
		
		Oval oval = new Oval(insertionTime, x, y, vx, vy, width, height, Color.rgb(r,g,b), isFilled);
		System.out.println(oval.toString());
		
		return oval;
	}
	
	/**
	 * Scans line of textfile beginning with "square"   
	 * and creates an instance of the square object
	 * 
	 * @param in	
	 * 			  the scanner of the file
	 * @return an instance of the square object
	 */
	public static Square square (Scanner in) {
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int side = in.nextInt();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		int insertionTime = in.nextInt();
				  
		Square square = new Square(insertionTime, x, y, vx, vy, side, Color.rgb(r,g,b), isFilled);
		System.out.println(square.toString());
		
		return square;
	}
	
	/**
	 * Scans line of textfile beginning with "rectangle"   
	 * and creates an instance of the rectangle object
	 * 
	 * @param in	
	 * 			  the scanner of the file
	 * @return an instance of the rectangle object
	 */
	public static Rect rect (Scanner in) {
		int x = in.nextInt();
		int y = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		boolean isFilled = in.nextBoolean();
		int width = in.nextInt();
		int height = in.nextInt();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		int insertionTime = in.nextInt();
					  
		Rect rect = new Rect(insertionTime, x, y, vx, vy, width, height, Color.rgb(r,g,b), isFilled);
		System.out.println(rect.toString());

		return rect;
	}
	
	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in
	 *            the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readDataFile(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();
	
		while (in.hasNext()) {
			String shape = in.next();
			switch (shape) {
				case "circle": 
					shapeQueue.enqueue(ReadShapeFile.circle(in));
					break;
				case "oval":
					shapeQueue.enqueue(ReadShapeFile.oval(in));
				    break;
				case "square":
					shapeQueue.enqueue(ReadShapeFile.square(in));
					break;
				case "rect":
					shapeQueue.enqueue(ReadShapeFile.rect(in));
					break;
				default:
					shape = in.next();
			}
		}
		in.close();
		return shapeQueue;
	}

	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue<ClosedShape> readDataFile(String filename) throws FileNotFoundException {	
		File file = new File(filename);
		Scanner in = new Scanner(file);	
		return ReadShapeFile.readDataFile(in);
		}
	}