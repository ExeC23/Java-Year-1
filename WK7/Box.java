public class Box{

	private int length,width,height,area,vol;

	public Box(){

		length = 0;
		width = 0;
		height = 0;
		System.out.println("Default Constuctor");
	}

	public Box(int length, int width){

			this.length = length;
			this.width = width;
			height = 0;
			System.out.println("second Constuctor" + length + width + height);
	}

	public Box(int length, int width, int height){

				this.length = length;
				this.width = width;
				this.height = height;
				System.out.println("Third Constuctor" + length + width + height);
	}

}