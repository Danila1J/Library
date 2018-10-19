public class ScientificLibraryHall {
    private String forename;
    private LinkedList<ScientificBook> list=new LinkedList<>();

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }


    public void setSizes(int size) {
        list.setSize(size);
    }

    public ScientificLibraryHall(String forename, int number) {
        this.forename = forename;
        list.setSize(number);
    }

    public ScientificLibraryHall(String forename, LinkedList list) {
        this.forename = forename;
        this.list = list;
    }

    public int getBookCount() {
        return list.getSize();
    }

    public void printName() {
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("Название книги: " + list.get(i).getData().getName());
        }
    }

    public double price() {
        double sum = 0;
        for (int i = 0; i < list.getSize(); i++) {
            sum += list.get(i).getData().getRub();
        }
        return sum;
    }

    public ScientificBook getBook(int index) {
        if (index >= 0 | index <= list.getSize()) {
            return list.get(index).getData();
        } else {
            return null;
        }
    }

    public void setBook(int index, ScientificBook book) {
        if (index >= 0 | index <= list.getSize()) {
            list.setNode(index, book);
            return;
        }
    }

    public void addBook(int index, ScientificBook book) {
        if (index >= 0 | index <= list.getSize()) {
            list.addNode(index, book);
            return;
        }
    }

    public void delBook(int index) {
        if (index >= 0 | index <= list.getSize()) {
            list.delNode(index);
            return;
        }
    }

    public ScientificBook getBestBook() {
        double count = 0;
        int index = 0;
        for (int i = 0; i < list.getSize(); i++) {
            if (count < list.get(i).getData().getRub()) {
                count = list.get(i).getData().getRub();
                index = i;
            }
        }
        return list.get(index).getData();
    }
}
