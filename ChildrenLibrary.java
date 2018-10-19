public class ChildrenLibrary {
    private ChildrenLibraryHall[] hall;

    public ChildrenLibrary(int numHall, int[] arrayBook) {
        hall = new ChildrenLibraryHall[numHall];
        for (int i = 0; i < numHall; i++) {
            hall[i] = new ChildrenLibraryHall(null, arrayBook[i]);
        }
    }


    public ChildrenLibrary(ChildrenLibraryHall[] halls) {
        hall = halls;
    }

    public int getHalls() {
        return hall.length;
    }

    public int getBooks() {
        int kolvoBook = 0;
        for (int i = 0; i < hall.length; i++) {
            kolvoBook += hall[i].getBookCount();
        }
        return kolvoBook;
    }

    public double sumPrice() {
        double sum = 0;
        for (int i = 0; i <= hall.length - 1; i++) {
            sum += hall[i].price();
        }
        return sum;
    }

    public ChildrenLibraryHall[] getHall() {
        return hall;
    }

    public ChildrenLibraryHall getCLH(int index) {
        return hall[index];
    }

    public ChildrenBook getCB(int index) {
        int count = 0;
        for (int i = 0; i < hall.length; i++) {
            count += hall[i].getBookCount();
            if (count > index) {
                return hall[i].getBook(index + hall[i].getBookCount() - count);
            }
        }
        return null;
    }

    public ChildrenBook[] sort() {
        int indexOfMax = 0;
        int indexOfMin = 0;
        int kol = 0;
        for (int i = 0; i < hall.length; i++) {
            kol += hall[i].getBookCount();
        }
        ChildrenBook[] arr = new ChildrenBook[kol];
        int count = 0;
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].getBookCount(); j++) {
                arr[count] = hall[i].getBook(j);
                count++;
            }
        }
        ChildrenBook temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getRub() < arr[j].getRub()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public void printArr(ChildrenBook[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printNameHollandNumbBook() {
        for (int i = 0; i < hall.length; i++) {
            System.out.println("Имя зала: " + hall[i].getForename() + " Кол-во книг: " + hall[i].getBookCount());
        }
    }

    public void replacHall(int index, ChildrenLibraryHall newHall) {
        if (index <= hall.length) {
            hall[index] = newHall;
        } else {
            System.out.println("Зала с таким индексом не существует");
        }
    }

    public void replacBook(int index, ChildrenBook ChBook) {
        int count = 0;
        for (int i = 0; i < hall.length; i++) {
            count += hall[i].getBookCount();
            if (count > index) {
                hall[i].setBook(index + hall[i].getBookCount() - count, ChBook);
                break;
            }
        }
    }

    public void addBook(int index, ChildrenBook ChBook) {
        int count = 0;
        for (int i = 0; i < hall.length; i++) {
            count += hall[i].getBookCount();
            if (count > index) {
                hall[i].add(index + hall[i].getBookCount() - count, ChBook);
            }
        }
    }

    public void delBook(int index) {
        int count = 0;
        for (int i = 0; i < hall.length; i++) {
            count += hall[i].getBookCount();
            if (count > index) {
                hall[i].del(index + hall[i].getBookCount() - count);
            }
        }
    }

    public ChildrenBook getBestBook() {
        ChildrenBook[] arr = new ChildrenBook[hall.length];
//        int indexOfMax = 0;
//        int indexOfMin = 0;
        for (int i = 0; i < hall.length; i++) {
            arr[i] = hall[i].getBestBook();
        }
        double count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count < arr[i].getRub()) {
                count = arr[i].getRub();
                index = i;
            }
        }
        return arr[index];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i].getRub() > (arr[indexOfMax].getRub())) {
//                indexOfMax = i;
//            } else if (arr[i].getRub() < arr[indexOfMin].getRub()) {
//                indexOfMin = i;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getRub() == arr[indexOfMax].getRub()) {
//                return arr[i];
//            }
//        }
//        return new ChildrenBook();
    }
}
