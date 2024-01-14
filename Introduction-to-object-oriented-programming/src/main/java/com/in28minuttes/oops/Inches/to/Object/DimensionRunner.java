package com.in28minuttes.oops.Inches.to.Object;

public class DimensionRunner {
    public static void main(String[] args) {

        Dimension dim = new Dimension(25);
        System.out.println(dim.getFeet());    // Output: 2
        System.out.println(dim.getInches());  // Output: 1

        dim = new Dimension(-1);
        System.out.println(dim.getFeet());    // Output: 2
        System.out.println(dim.getInches());  // Output: 1
    }
}
