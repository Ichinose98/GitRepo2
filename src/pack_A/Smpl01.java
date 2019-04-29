package pack_A;
import java.util.*;
//Edit from GitHub
class elem{
	String word = "";
	elem (String word){
		this.word = word;
	}
}
 
interface intf{
	String s = "";
}

public class Smpl01 {	
	private final List<elem> list = new ArrayList();
	
	Smpl01(){
		list.add(new elem("A"));
		list.add(new elem("B"));
		list.add(new elem("C"));
	}
	
	public elem getElelemt(int i) {
		elem e = new elem(list.get(i).word);
		return e;
	}
	
	public static void main (String[] args) {
		Smpl01 s = new Smpl01();
		elem x = s.getElelemt(0);
		x.word = "X";
		elem y = s.getElelemt(1);
		elem z = s.getElelemt(2);
		
		
	}

}
//
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
		StaticNested st = new Outer.StaticNested();
		MemberInner mi = new Outer().new MemberInner();
		
		//Local Inner Class
		class LocalInner{}
		
		//Anonymous Inner Class
		Intf i = new Intf() {
			public void m() {};
		};
	}
}
