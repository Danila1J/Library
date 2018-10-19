public class ChildrenLibraryHall {
    private String forename;
    private ChildrenBook[] mas;

    public ChildrenLibraryHall(String forename, int number) {
        this.forename = forename;
        mas = new ChildrenBook[number];
        for (int i = 0; i < number; i++) {
            mas[i] = new ChildrenBook(null,i,i);
        }
    }

    public ChildrenLibraryHall(String forename, ChildrenBook[] mas) {
        this.forename = forename;
        this.mas = mas;
    }

    public String getForename() {
        return forename;
    }

    public int getNumber() {
        return mas.length;
    }

    public ChildrenBook[] getMas() {
        return mas;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setMas(ChildrenBook[] mas) {
        this.mas = mas;
    }

    public void printName() {
        for (int i = 0; i < mas.length; i++)
            System.out.println("Название книги: " + mas[i].getName());
    }

    public double price() {
        double sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i].getRub();
        }
        return sum;
    }

    public ChildrenBook getBook(int n) {
        return mas[n];
    }

    public int getBookCount() {
        return mas.length;
    }

    public void setBook(int index, ChildrenBook ChBook) {
        mas[index] = ChBook;
    }

    public void add(int index, ChildrenBook book) {
        ChildrenBook arr[] = new ChildrenBook[mas.length + 1];
        for (int i = 0; i < index; i++) {
            arr[i] = mas[i];
        }
        arr[index] = book;
        for (int i = index + 1; i < arr.length; i++) {
            arr[i] = mas[i - 1];
        }
        mas = arr;
    }

    public void del(int index) {
        ChildrenBook arr[] = new ChildrenBook[mas.length - 1];
        for (int i = 0; i < index; i++) {
            arr[i] = mas[i];
        }
        for (int i = index + 1; i <= arr.length; i++) {
            arr[i - 1] = mas[i];
        }
        mas = arr;
    }

    public ChildrenBook getBestBook() {
        double count = 0;
        int index = 0;
        for (int i = 0; i < mas.length; i++) {
            if (count < mas[i].getRub()) {
                count = mas[i].getRub();
                index = i;
            }
        }
        return mas[index];
//        int indexOfMax = 0;
//        int indexOfMin = 0;
//        for (int i = 1; i < mas.length; i++) {
//            if (mas[i].getRub() > (mas[indexOfMax].getRub())) {
//                indexOfMax = i;
//            } else if (mas[i].getRub() < mas[indexOfMin].getRub()) {
//                indexOfMin = i;
//            }
//        }
//        for (int i = 0; i < mas.length; i++) {
//            if (mas[i].getRub() == mas[indexOfMax].getRub()) {
//                return mas[i];
//            }
//        }
//        return new ChildrenBook();
    }
}
