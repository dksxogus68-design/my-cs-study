public class Cube {
	int width; //필드 가로,세로,높이
	int deepth;
	int height;
	
	public Cube(int width, int deepth, int height ) {
		this.width = width;  //객체 생성 가로,세로,높이 정함
		this.deepth = deepth;
		this.height = height;
	}
	
	public int getVolume() {
		return width*deepth*height; //부피를 계산해서 리턴
	}
	public void increase(int width, int deepth, int height  ) {
		this.width += width;
		this.deepth += deepth;  //필드값을 입력값을 받은 만큼 증가시킴
		this.height += height;
	}
	public boolean isZero() {
		if(getVolume() == 0) {
			return true;  //부피가 0이면 참, 부피가 0이 아니면 거짓
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Cube cube = new Cube(1, 2, 3); // 가로, 세로, 높이가1, 2, 3
		System.out.println("큐브의부피는"+ cube.getVolume());
		cube.increase(1,2,3);
		System.out.println("큐브의부피는"+ cube.getVolume());
		if (cube.isZero()) System.out.println("큐브이부피는0");
		else System.out.println("큐브의부피는0이아님");
		}
}
 