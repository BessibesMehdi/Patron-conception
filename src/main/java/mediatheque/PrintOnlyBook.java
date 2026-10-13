package mediatheque;

public class PrintOnlyBook implements Visiteur {

	@Override
	public void visit(Book book) {
		book.print();
	}

	@Override
	public void visit(CD cd) {
		
	}
}
