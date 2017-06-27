package structural_patterns.Decorator.before;

class AwithZ extends A {
	
    public void doIt() {
    	
        super.doIt();
        doZ();
    }

    public void doZ() {
        System.out.print('Z');
    }
}
