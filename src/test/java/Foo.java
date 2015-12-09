public class Foo {
	
	public boolean op(Boolean a, Boolean b) {
		return a || b;
	}
	
	public boolean op2(Integer a, Integer b) {
		return a > b;
	}

	public boolean op3(Class c) {
		return Foo.class==c;
	}
	
	public void op4(int a, int b){
		System.out.println(a + b);
	}
	
	public int op5(int a, int b){
		return a + b;
	}
}