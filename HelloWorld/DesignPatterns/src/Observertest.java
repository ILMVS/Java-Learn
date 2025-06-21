import java.util.List;
import java.util.ArrayList;

public interface Observertest {

}

// Every time a user adds a book to the library,
// all observers are notified if the book is available or has been borrowed or damaged
class Library {
    private List<ObserverBook> observers = new ArrayList<>();
    private List<String> books = new ArrayList<>();

    public void addObserver(ObserverBook observer) {
        observers.add(observer);
    }

    public void removeObserver(ObserverBook observer) {
        observers.remove(observer);
    }

    public void addBook(String book) {
        books.add(book);
        notifyObservers("Book added: " + book);
    }

    public void borrowBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            notifyObservers("Book borrowed: " + book);
        } else {
            notifyObservers("Book not available: " + book);
        }
    }

    private void notifyObservers(String message) {
        for (ObserverBook observer : observers) {
            observer.update(message);
        }
    }
}

class ObserverBook  {
    private String name;

    public ObserverBook(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}