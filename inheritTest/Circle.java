package inheritTest;


public class Circle extends Point{
	
	private float radius;
	private static float Pi = 3.14159265f;
	
	Circle(){
		radius = 0.0f;
	}
	
	Circle(int x,int y,float r){
		super(x,y);
		this.radius = r;
	}
	
	public void setRadius(int r){
		this.radius = r;
	}
	
	public float getRadius(){
		return radius;
	}
	
	public float getArea(){
		return Pi*radius*radius;
	}
	
	public float getPerimeter(){
		return Pi*2*radius;
	}
	
	public String toString(){
		StringBuffer buff = new StringBuffer();
		buff.append("Բ");
		buff.append(super.toString());
		buff.append(",�뾶��");
		buff.append(radius);
		buff.append(",�ܳ���");
		buff.append(getPerimeter());
		buff.append(",�����");
		buff.append(getArea());
		return new String(buff);
	}
	
}