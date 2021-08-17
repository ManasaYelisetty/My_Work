package day4_1;

public class Square extends Shape {
private Integer side;

public Integer getSide() {
	return side;
}

public void setSide(Integer side) {
	this.side = side;
}
public float calculatedArea() {
	Float area=Float.valueOf((float)side*side);
	return area;
	}

public Square(String name, Integer side) {
	super(name);
	this.side = side;
}

}
