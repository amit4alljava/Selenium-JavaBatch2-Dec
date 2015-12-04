class Shape
{
	void draw(){
		System.out.println("This is the Generic Draw...");
	}
	void fillColor(){
		System.out.println("This is the Shape Fill Color...");
	}
	void drawBorders(){
		System.out.println("This is the Draw Border of Shape");
	}
}
class Square extends Shape
{
	@Override
	void draw(){
		System.out.println("this is Square Draw...");
	}
	void drawBorders(){
		System.out.println("This is the Draw Border of Square");
	}
	
}
class Circle extends Shape{
	@Override
	void draw(){
		System.out.println("this is Circle Draw...");
	}
	void printCircle(){
		System.out.println("Circle Class Print Method");
	}
}
class Drawing{
	void drawShapes(Shape shape){
		shape.draw();
		shape.drawBorders();
		shape.fillColor();
		if(shape instanceof Circle){
			((Circle)shape).printCircle();  // Downcasting
		}
	}
}
public class DynamicPolymorphism {

	
	
	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.drawShapes(new Square());
		/*Shape shape = new Circle(); //Upcasting
		shape.draw();
		shape.drawBorders();*/
		//shape.printCircle();
		
		/*Shape shape = new Shape();
		shape.draw();
		shape.drawBorders();
		shape.fillColor();
		
		Square square = new Square();
		square.draw();
		square.drawBorders();
		square.fillColor();
		
		
		Circle circle = new Circle();
		circle.draw();
		circle.drawBorders();
		circle.fillColor();*/
		

	}

}
