/**
* File Name: Square.java
* 
* <p> Purpose: Draws a square on screen
* 
* @date 2020-03-01 
* <p> Last modified: 2020-03-01
* @author Josen Pottackal
* - no copyright
* @version 1.0
*/

import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Square is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the square's bounding rectangle.
 */
public class Square extends ClosedShape {
	//The length of the square's sides 
	private int side;
	
	/**
	 * Creates a square.
	 * @param x The display component's x position.
	 * @param y The display component's y position.
	 * @param vx The display component's x velocity.
	 * @param vy The display component's y velocity.
	 * @param width The side length of the square (in pixels).
	 * @param colour The line colour or fill colour.
	 * @param isFilled True if the square is filled with colour, false if opaque.
	 */
	public Square (int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled) {
		super (insertionTime, x, y, vx, vy, colour, isFilled);
		this.side = side;
	}
	
	/**
     * Method to convert a square to a string.
     */
	public String toString () {
    	String result = "This is an square\n";
    	result += super.toString ();
    	result += "Its side lengths are " + this.side + "\n";
    	return result;
    }
	
	/**
 	 * @param height Resets the height.
 	 */
    public void setHeight(int side) {
    	this.side = side;
    }
    
    /**
	 * @param width Resets the width.
	 */
    public void setWidth(int side) {
    	this.side = side;
    }
    
    /**
 	 * @return The height of the square.
 	 */
    public int getHeight() {
    	return side;
    }
    
    /**
 	 * @return The width of the square.
 	 */
    public int getWidth() {
    	return side;
    }
    
    /**
 	 * Draw the square.
 	 * @param g The graphics object of the drawable component.
 	 */
    public void draw (GraphicsContext g) {
    	g.setFill(colour);
    	g.setStroke(colour);
    	if (isFilled) {
    		g.fillRect(x, y, side, side);
    	} 
    	else {
    		g.strokeRect(x, y, side, side);
	    }
    }

}
