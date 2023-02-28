
public class OperResta extends Operacion {

	public OperResta(int _x, int _y) {
		super(_x, _y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int Operar() {
		return this.x - this.y;
	}

}
