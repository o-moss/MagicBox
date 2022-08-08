import java.util.Random;

public class MagicBox<T> {
    protected int maxNumberOfItems;
    protected T[] items;

    public MagicBox(int maxNumberOfItems) {
        this.setMaxNumberOfItems(maxNumberOfItems);
        items = (T[]) new Object[maxNumberOfItems];
    }

    public void setMaxNumberOfItems(int maxNumberOfItems) {
        this.maxNumberOfItems = maxNumberOfItems;
    }

    public boolean add(T item) {
        for (int i = 0; i < maxNumberOfItems; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int k = 0;
        for (int j = 0; j < maxNumberOfItems; j++) {
            if (items[j] != null) {
                k++;
            }
        }
        if (k < maxNumberOfItems) {
            throw new RuntimeException("Волшебная коробка не полна! Незаполненных ячеек - " + k + "! Дозаполните, пожалуйста, ячейки!");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(maxNumberOfItems);
            return this.items[randomInt];
        }

    }
}
