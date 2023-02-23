package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.clear();
	StdDraw.setPenColor(255, 0, 255);
	StdDraw.filledRectangle(0.5, 0.5, .5, .25);
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.rectangle(0.5, 0.5, .5, .25);
	StdDraw.setPenColor(0, 200, 255);
	StdDraw.filledCircle(0.5, 0.5, .2);
	StdDraw.setPenColor(0, 0, 255);
	StdDraw.filledCircle(0.5, 0.5, .1);
		
		
	}
}