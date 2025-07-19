package Access_modifier;

public class Base {
	// Declaring default, public, private and protected variables
	
		int varDefault= 10;
		public int varPublic=20;
		private int varPrivate=30;
		protected int varProtected=40;
		
		// Declaring default, public, private and protected methods
		
		void methodDefault()
		{
			System.out.println("Default Access Modifier");
			System.out.println("Default Variable "+ varDefault);
		}
		
		public void methodPublic()
		{
			System.out.println("Public Access Modifier");
			System.out.println("Public Variable "+ varPublic);
		}
		
		private void methodPrivate()
		{
			System.out.println("Private Access Modifier");
			System.out.println("Private Variable "+ varPrivate);
		}
		
	    protected void methodProtected()
		{
			System.out.println("Protected Access Modifier");
			System.out.println("Protected Variable "+ varProtected);
		}
	    public void callPrivate()
	    {
	    		methodPrivate();              //we can't access private method or var directly so we accessed it from converting in public class 
	    }

}
