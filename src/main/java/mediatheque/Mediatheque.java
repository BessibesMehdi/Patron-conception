package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void accept(Visiteur v) {
		for (Item i : items) {
			i.accept(v);
		}
	}

	public void printCatalog() {
		accept(new PrintCatalog());
	}
	
	public void printOnlyBooks() {
		accept(new PrintOnlyBook());
	}

	public void printOnlyCDs() {
		accept(new PrintOnlyCD());
	}

}
