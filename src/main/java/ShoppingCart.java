import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<String> items = new ArrayList<>();

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(String name) {
        if (name == null || name.trim().isEmpty()) return;
        items.add(name.trim());
    }

    public boolean removeItem(String name) {
        return items.remove(name);
    }

    public void clear() {
        items.clear();
    }
}
