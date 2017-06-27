package structural_patterns.Decorator.before;

class AwithY extends A {
	
    public void doIt() {
    	
        super.doIt();
        doY();
    }

    public void doY()  {
        System.out.print('Y');
    }
}
