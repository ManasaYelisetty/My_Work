package day4_1;

public  class Circle extends Shape {
	private Integer radius;

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public float calculatedArea() {
		Float area = Float.valueOf(radius * radius * 3.14f);
		return area;
	}

	public Circle(String name, Integer radius) {
		super(name);
		this.radius = radius;
	}

	
}
