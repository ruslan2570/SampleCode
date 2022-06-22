class StorageAndBoxes {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Box box1 = new Box(12, "Forks");
        Box box2 = new Box(1, "Milk");
        Box box3 = new Box(0, "Eggs");
        storage.putBox(box1);
        storage.putBox(box2);
        storage.putBox(box3);
        storage.printBoxes();
        System.out.println(box3.weight);
    }
}

class Storage {
    String[] boxes = new String[10];
    int index = 0;

    public void putBox(Box b) {
        int o = b.weight;
        boxes[index++] = b.contains;
        o = 42;
    }

    public void printBoxes() {
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] == null) return;
            System.out.println(boxes[i]);
        }
    }
}

class Box {
    public int weight;
    String contains;

    public Box(int w, String cont) {
        weight = w;
        contains = cont;
    }
}