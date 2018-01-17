package test;


interface A {
	public void display();

}

public class Test {
	int id = 123;

	public static void main(String[] args) {
		
	}

	public void print() {
		int b = 23;
		A a = () -> {
			System.out.println(id);
			System.out.println(b);
		};

		a.display();
	}

}
