package pack_A;

public class Smpl01 {

}

class Outer {
	//Singleton
	private Outer() {}
	private static final Outer instance = new Outer();
	public static Outer getInstance () {
		return instance;
	}
	
	//Use for Anonymous Inner Class
	static interface Intf{
		void m();
	}
	
	//Member Inner Class
	class MemberInner{}
	
	//Static Nested Class
	static class StaticNested{}
	
	void method01() {
		//Local Inner Class
		class LocalInner{}
		
		//Anonymous Inner Class
		Intf i = new Intf() {
			public void m() {};
		};
	}
}
