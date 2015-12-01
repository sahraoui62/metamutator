public class Foo {
	
	public boolean op(Boolean a, Boolean b) {
		return a || b;
	}
	
	public boolean op2(Integer a, Integer b) {
		return a > b;
	}

	public boolean op3(Class c) {
		return Foo.class == c;
	}
	
	public int op4(int a, int b) {
		return a+b;
	}
}