package mediatheque;

public class PrintCatalog implements Visiteur {

	@Override
	public void visit(Book book) {
		book.print();
	}

	@Override
	public void visit(CD cd) {
		cd.print();
	}
}
