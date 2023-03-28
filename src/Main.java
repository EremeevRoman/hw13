public class Main {
    public static void main(String[] args) {

        String[] authorName = {"Л.Н.Толстой", "Ф.М.Достоевский"};
        String[] bookName = {"Война и Мир", "Преступление и наказание"};
        int[] publishingYear = {1867, 1866};
        for (int i = 0; i < authorName.length; i++) {
            System.out.println("Имя автора - " + authorName[i] + " Имя книги " + bookName[i] + " Год публикации " + publishingYear[i]);
        }
        Author lev = new Author("Лев", "Толстой");
        System.out.println("Лев");
        Author tolstoy = new Author("Лев", "Толстой");
        System.out.println("Толстой");
        Book warAndPeace = new Book("Война и мир", lev, 1867);
        System.out.println("warAndPeace = " + warAndPeace.getBookName());
        Book authorBook = new Book("Война и мир", lev, 1867);
        System.out.println("authorBook = " + authorBook.getString());
        Book yearBook = new Book("Война и мир", lev, 1867);
        System.out.println("yearBook = " + yearBook.getPublishingYear());

        Author fedor = new Author("Фёдор", "Достоевский");
        System.out.println("Фёдор");
        Author dostoevsky = new Author("Фёдор", "Достоевский");
        System.out.println("Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", fedor, 1866);
        System.out.println("crimeAndPunishment = " + crimeAndPunishment.getBookName());
        Book authorSecondBook = new Book("Преступление и наказание", fedor, 1866);
        System.out.println("authorSecondBook = " + authorSecondBook.getString() + authorSecondBook.getString());
        Book yearSecondBook = new Book("Преступление и наказание", fedor, 1866);
        System.out.println("yearSecondBook = " + yearSecondBook.getPublishingYear());

        String yearBornFirtsBook = "1866";
        System.out.println(yearBornFirtsBook.hashCode());
        String yearBornSecondBook = "1867";
        System.out.println(yearBornSecondBook.hashCode());
        if (yearBornFirtsBook.equals(yearBornSecondBook)) {
            System.out.println("Книги выпускались в один год");
        } else {
            System.out.println("Книги выпускались в разные года");
        }


    }
}







