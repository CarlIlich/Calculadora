
public class OperSuma extends Operacion {

	public OperSuma(int _x, int _y) {
		super(_x, _y);
	}

	@Override
	public int Operar() {
		return this.x + this.y;
	}

}
