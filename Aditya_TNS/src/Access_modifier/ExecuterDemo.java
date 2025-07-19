package Access_modifier;

public class ExecuterDemo extends Base {

	public static void main(String[] args) {

		Base b = new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		b.callPrivate();		
	}

}