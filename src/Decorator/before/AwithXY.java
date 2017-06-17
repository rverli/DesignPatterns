package Decorator.before;

class AwithXY extends AwithX {
	
    private AwithY obj = new AwithY();
    
    public void doIt() {
    	
        super.doIt();
        obj.doY();
    }
}
