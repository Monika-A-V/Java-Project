package com.Test_8;

/*A Pen contains variables Refill, capLength and brand. Refill has variables
inkColor, length and Nib (tip). Nib has variables materialType and width. Create
a Java class structure for above. Write a main method which sets values in all the variables
using setter methods and prints all the variables using getter methods.
 (consider getter,setter are present in all classes only write main method)*/

class Pen {
    private Refill refill;
    private int capLength;
    private String brand;

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    public void setCapLength(int capLength) {
        this.capLength = capLength;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Refill getRefill() {
        return refill;
    }

    public int getCapLength() {
        return capLength;
    }

    public String getBrand() {
        return brand;
    }
}

class Refill {
    private String inkColor;
    private int length;
    private Nib nib;

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public String getInkColor() {
        return inkColor;
    }

    public int getLength() {
        return length;
    }

    public Nib getNib() {
        return nib;
    }
}

class Nib {
    private String materialType;
    private int width;

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public void setWidth(double d) {
        this.width = (int) d;
    }

    public String getMaterialType() {
        return materialType;
    }

    public int getWidth() {
        return width;
    }
}

public class Q11 {

	public static void main(String[] args) {

		    Pen pen = new Pen();
		    Refill refill = new Refill();
		    Nib nib = new Nib();

		    nib.setMaterialType("steel");
		    nib.setWidth(0.5);
		    refill.setInkColor("blue");
		    refill.setLength(10);
		    refill.setNib(nib);
		    pen.setRefill(refill);
		    pen.setCapLength(5);
		    pen.setBrand("Parker");

		    System.out.println("Pen Brand: " + pen.getBrand());
		    System.out.println("Cap Length: " + pen.getCapLength());
		    System.out.println("Refill Ink Color: " + pen.getRefill().getInkColor());
		    System.out.println("Refill Length: " + pen.getRefill().getLength());
		    System.out.println("Refill Nib Material Type: " + pen.getRefill().getNib().getMaterialType());
		    System.out.println("Refill Nib Width: " + pen.getRefill().getNib().getWidth());
		}

	}

