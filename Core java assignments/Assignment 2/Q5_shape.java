package_drawshape;


abstract class shape {
	abstract void draw();
	

}


package_drawshape;

public class line extends shape{

	@Override
	void draw() {
		System.out.println("Draw line");
		
	}

}
package_drawshape;


public class rectangle extends shape {

	@Override
	void draw() {
		System.out.println("Draw Rectangle");
		
	}

}

package_drawshape;


public class cube extends shape{

	@Override
	void draw() {
		System.out.println("Draw cube");
		
	}
	

}
package_drawshape;


public class testfinal {

	public static void main(String[] args) {
		
		line myline=new line();
		rectangle myrectangle =new rectangle();
		cube mycube=new cube();
		myline.draw();
		myrectangle.draw();
		mycube.draw();
	}

}
