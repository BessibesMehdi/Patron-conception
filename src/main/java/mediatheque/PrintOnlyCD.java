package mediatheque;

public class PrintOnlyCD implements Visiteur {

	@Override
	public void visit(Book book) {
		
	}

	@Override
	public void visit(CD cd) {
		cd.print();
	}
}
