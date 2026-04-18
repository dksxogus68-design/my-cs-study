public class Rectangle {
	int x, y, width, height; //필드 x,y점 가로,세로
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;          //인자를 받는 생성자
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		if(width == height) { //가로세로가 같으면 정사각형, 다르면 정사각형 아님
			return true;
		}
		else {
			return false;
		}
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")에서 크기가"+ width + "x" + height + "크기의 사각형");
	}
	public boolean contains(Rectangle r) {
		if(r.x >= x && r.y >= y && //Rectangle r이 큰 정사각형 안에 포함하는 조건
				r.x+ r.width <= x+ width && r.y+ r.height <= y+height) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Rectangle a = new Rectangle(3, 3, 6, 6); // (3,3) 점에서6x6 크기의사각형
		Rectangle b = new Rectangle(4, 4, 2, 3); // (4,4) 점에서2x3 크기의사각형
		a.show();
		if( a.isSquare() ) System.out.println("a는정사각형입니다.");
		else System.out.println("a는직사각형입니다.");
		if( a.contains(b) ) System.out.println("a는b를포함합니다.");
		}

}
