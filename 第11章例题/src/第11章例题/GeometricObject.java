package ��11������;

public class GeometricObject {
    private String color="white";
    private boolean filled;
    private java.util.Date dateCreated;
    
    //Construct a default geometric object
    public GeometricObject() {
    	dateCreated=new java.util.Date();
    }
    
    //Construct a geometric object with the specified color and filled value
    public GeometricObject(String color,boolean filled) {
    	dateCreated=new java.util.Date();
    	this.color=color;
    	this.filled=filled;
    }
    
    //return color
    public String getColor() {
    	return color;
    }
    //set a new color
    public void setColor(String color) {
    	this.color=color;
    }
    //return filled.Since filled is boolean,its getter method is named isFilled
    public boolean isFilled() {
    	return filled;
    }
    public void setFilled(boolean filled) {
    	this.filled=filled;
    }
    //get dateCreated
    public java.util.Date getDateCreated(){
    	return dateCreated;
    }
    //return a string representation of this object
    public String toString() {
    	return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
    }
}
