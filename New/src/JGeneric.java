class Hello {
	public String toString() {
		return "6";
	}
}

public class JGeneric<T1, T2, T3> {
	public String test(T1 a, T2 b, T3 c) {
		return (a.toString() + b.toString() + c.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JGeneric<Integer, String, Hello> j = new JGeneric<Integer, String, Hello>();
		Integer a = new Integer(1);
		String b = new String("2");
		Hello c = new Hello();
		System.out.println(j.test(a, b, c));
	}

}
