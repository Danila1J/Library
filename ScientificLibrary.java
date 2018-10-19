//public class ScientificLibrary {
//    private DoublyLinkedList<ScientificLibraryHall> halls=new DoublyLinkedList<>();
//
//    public ScientificLibrary(int numHall, int[] arrayBook) {
//        halls = new DoublyLinkedList<>();
//        halls.setSize(numHall);
//        for (int i = 0; i < numHall; i++) {
//            halls.get(i).s;
//        }
//    }
//
//
//    public int getHalls() {
//        return halls.getSize();
//    }
//
//    public int getBooks() {
//        int kolvoBook = 0;
//        for (int i = 0; i < halls.getSize(); i++) {
//            kolvoBook += halls[i].getBookCount();
//        }
//        return kolvoBook;
//    }
//
//    public double sumPrice() {
//        double sum = 0;
//        for (int i = 0; i <= halls.getSize() - 1; i++) {
//            sum += halls[i].price();
//        }
//        return sum;
//    }
//
//    public DoublyLinkedList getHall() {
//        return halls;
//    }
//
//    public DoublyLinkedList getSLH(int index) {
//        return halls.get(index);
//    }
//
//    public ScientificBook getSB(int index) {
//        int count = 0;
//        for (int i = 0; i < halls.getSize(); i++) {
//            count += halls[i].getBookCount();
//            if (count > index) {
//                return halls[i].getBook(index + halls[i].getBookCount() - count);
//            }
//        }
//        return null;
//    }
//
//    public ScientificBook[] sort() {
//        int indexOfMax = 0;
//        int indexOfMin = 0;
//        int kol = 0;
//        for (int i = 0; i < halls.length; i++) {
//            kol += halls[i].getBookCount();
//        }
//        ScientificBook[] arr = new ScientificBook[kol];
//        int count = 0;
//        for (int i = 0; i < halls.length; i++) {
//            for (int j = 0; j < halls[i].getBookCount(); j++) {
//                arr[count] = halls[i].getBook(j);
//                count++;
//            }
//        }
//        ScientificBook temp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].getRub() < arr[j].getRub()) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        return arr;
//    }
//
//    public void printNameHollandNumbBook() {
//        for (int i = 0; i < halls.getSize(); i++) {
//            System.out.println("Имя зала: " + halls.get(i).getData() + " Кол-во книг: " + halls.get(i).getData());
//        }
//    }
//
//    public void replacHall(int index, ScientificLibraryHall newHall) {
//        if (index <= halls.length) {
//            halls[index] = newHall;
//        } else {
//            System.out.println("Зала с таким индексом не существует");
//        }
//    }
//
//    public void replacBook(int index, ScientificBook ScBook) {
//        int count = 0;
//        for (int i = 0; i < halls.length; i++) {
//            count += halls[i].getBookCount();
//            if (count > index) {
//                halls[i].setBook(index + halls[i].getBookCount() - count, ScBook);
//                break;
//            }
//        }
//    }
//
//    public void addBook(int index, ScientificBook ShBook) {
//        int count = 0;
//        for (int i = 0; i < halls.length; i++) {
//            count += halls[i].getBookCount();
//            if (count > index) {
//                halls[i].addBook(index + halls[i].getBookCount() - count, ShBook);
//            }
//        }
//    }
//
//    public void delBook(int index) {
//        int count = 0;
//        for (int i = 0; i < halls.length; i++) {
//            count += halls[i].getBookCount();
//            if (count > index) {
//                halls[i].delBook(index + halls[i].getBookCount() - count);
//            }
//        }
//    }
//
//    public ScientificBook getBestBook() {
//        ScientificBook[] arr = new ScientificBook[halls.getSize()];
//        for (int i = 0; i < halls.getSize(); i++) {
//            arr[i] = halls[i].getBestBook();
//        }
//        double count = 0;
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (count < arr[i].getRub()) {
//                count = arr[i].getRub();
//                index = i;
//            }
//        }
//        return arr[index];
//    }
//
//    public void printArr(ScientificBook[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//}
