package Decorator.before;

class AwithXYZ extends AwithX {
	
    private AwithY obj1 = new AwithY();
    private AwithZ obj2 = new AwithZ();

    public void doIt() {
    	
        super.doIt();
        obj1.doY();
        obj2.doZ();
    }
}
