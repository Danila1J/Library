public class ScientificBook extends Book {
    private double index;

    public void setIndex(double i) {
        index = i;
    }

    public double getIndex() {
        return index;
    }

    public ScientificBook() {
        super();
        index = 0.0;
    }

    public ScientificBook(String author, String name, double rub, int year, double index) {
        super(author, name, rub, year);
        this.index = index;
    }

    public ScientificBook(String author, int year, double index) {
        super(author, year);
        this.index = index;
    }

    public String toString() {
        String out = "";
        return out = "Автор: " + getAuthor() + " , " + "Название книги: " + getName() + " , " + "Стоимость: " + getRub() + " , " + "Год издания: " + getYear() + " , " + "Индекс цитируемости: " + getIndex();
    }
}
