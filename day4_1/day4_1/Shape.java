package day4_1;

public abstract class Shape {
      protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(String name) {
		this.name = name;
	}
      abstract float calculatedArea();
}
