import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class Library {
    private ArrayList<Book> inventory;
    private Integer capacity;
    private HashMap stockByGenre;

    public Library(Integer capacity) {
        this.inventory = new ArrayList<>();
        this.capacity = capacity;
        this.stockByGenre = new HashMap<>();
    }

    public int getStockCount() {
        return inventory.size();
    }

    public void addBook(Book newBook) {
        if(checkCapacity()) {
            inventory.add(newBook);
            hashBook(newBook);
        }
    }

    public boolean checkCapacity() {
        if (inventory.size() < capacity) {
            return true;
        }
        return false;
    }

    public void removeBook(Book bookToRemove) {
        int index = inventory.indexOf(bookToRemove);
        inventory.remove(index);
    }

    public void hashBook(Book book) {
        String genre = book.getGenre();
        if(stockByGenre.containsKey(genre)) {
            int newStock = (int) stockByGenre.get(genre);
            newStock++;
            stockByGenre.put(genre, newStock);
        }
        stockByGenre.put(book.getGenre(), 1);
    }

    public int getStockByGenre(String genre) {
        return (int) stockByGenre.get(genre);
    }

}

