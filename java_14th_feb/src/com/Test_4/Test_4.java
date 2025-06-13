package com.Test_4;

//A Pen contains variables Refill, capLength and brand. Refill has variables
//inkColor, length and Nib (tip). Nib has variables materialType and width. Create
//a  class structure for above. Write a main method which sets values in all the variables
//using setter methods and prints all the variables using getter methods

class Pen {
    private Refill refill;
    private int capLength;
    private String brand;

    public Pen(Refill refill, int capLength, String brand) {
        this.refill = refill;
        this.capLength = capLength;
        this.brand = brand;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }

    public void setCapLength(int capLength) {
        this.capLength = capLength;
    }

    public int getCapLength() {
        return capLength;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
class Refill {
    private String inkColor;
    private int length;
    private Nib nib;

    public Refill(String inkColor, int length, Nib nib) {
        this.inkColor = inkColor;
        this.length = length;
        this.nib = nib;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public String getInkColor() {
        return inkColor;
        
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public Nib getNib() {
        return nib;
    }
}

class Nib {
    private String materialType;
    private double width;

    public Nib(String materialType, double width) {
        this.materialType = materialType;
        this.width = width;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
public class Test_4 {

	public static void main(String[] args) {

		 Pen pen = new Pen(new Refill("black", 10, new Nib("steel", 0.7)), 10, "Bic");

	        pen.setRefill(new Refill("blue", 12, new Nib("plastic", 0.5)));
	        pen.setCapLength(8);
	        pen.setBrand("Pilot");

	        System.out.println("Refill ink color: " + pen.getRefill().getInkColor());
	        System.out.println("Refill length: " + pen.getRefill().getLength());
	        System.out.println("Refill nib material type: " + pen.getRefill().getNib().getMaterialType());
	        System.out.println("Refill nib width: " + pen.getRefill().getNib().getWidth());
	        System.out.println("Cap length: " + pen.getCapLength());
	        System.out.println("Brand: " + pen.getBrand());
	    }
	}

	
