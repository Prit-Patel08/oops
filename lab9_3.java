import java.util.ArrayList;
import java.util.List;

interface Item {
    int getSize();
    void show(String indent);
}

class File implements Item {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() { return size; }

    public void show(String indent) {
        System.out.println(indent + name + " (" + size + " KB)");
    }
}

class Folder implements Item {
    private String name;
    private List<Item> items = new ArrayList<>();

    public Folder(String name) { this.name = name; }

    public void add(Item item) { items.add(item); }

    public int getSize() {
        int total = 0;
        for (Item item : items) total += item.getSize();
        return total;
    }

    public void show(String indent) {
        System.out.println(indent + name + "/");
        for (Item item : items) item.show(indent + "  ");
    }
}

public class lab9_3 {
    public static void main(String[] args) {
        Folder college = new Folder("College");
        Folder notes = new Folder("Notes");
        notes.add(new File("Java.pdf", 500));
        notes.add(new File("DBMS.pdf", 300));
        college.add(notes);
        college.add(new File("Photo.jpg", 200));

        college.show("");
        System.out.println("Total size of College: " + college.getSize() + " KB");
    }
}
