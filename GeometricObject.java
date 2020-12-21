package temi18do20;

public class GeometricObject {
private String colour = "white";
private boolean filled;
private java.util.Date dateCreated;

public GeometricObject() {
	dateCreated = new java.util.Date();
	
}
public GeometricObject(String colour , boolean filled) {
	dateCreated = new java.util.Date();
	this.colour = colour;
	this.filled = filled;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public boolean getFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}
public java.util.Date getDateCreated(){
	return dateCreated;
}
public String toString () {
	return "created on " + dateCreated +"\ncolor: " + colour + " and filled: " + filled;
}

}