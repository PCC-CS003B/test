// File Name: CenteredSquaresPrinter.java
// Authors: Leane Che and Kenji Longid
// Email Address: lche2@go.pasadena.edu and klongid@go.pasadena.edu
// Assignment: Lab1 Ch2 P2.3
// Description: Transform a square to be half of its size with the same center.
// Last date changed: August 30, 2023

import java.awt.Rectangle;

public class CenteredSquaresPrinter {
    public static void main(String[] args) {
        int originalSideLength = 200;
        Rectangle square = new Rectangle(100, 100, originalSideLength, originalSideLength);

        int shrinkFactor = -(originalSideLength / 4);

        // Before transformation
        System.out.println(square);

        // Apply transformation
        square.grow(shrinkFactor, shrinkFactor);
        square.translate(0, shrinkFactor * 2);

        // After transformation
        System.out.println(square);
    }
}