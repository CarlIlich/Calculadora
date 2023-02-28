
public abstract class Operacion {
	protected int x;
	protected int y;
	
	public Operacion(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}
	
	public abstract int Operar();
}
