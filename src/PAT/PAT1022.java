package PAT;

import java.util.*;
import java.util.function.BinaryOperator;

/**
 * @author xandcosmos@gmail.com
 * @date 2019-09-26 18:19
 */
public class PAT1022 {
    private static SortedSet<Book> bookSortedSet = new TreeSet<>(Comparator.comparing(Book::getId));

    public static void getResult(String line) {
        int queryMethod = Integer.valueOf(line.split(": ")[0]);
        String keyword = line.split(": ")[1];
        System.out.println(line);
        boolean flag = false;
        switch (queryMethod) {
            case 1:
                for (Book book : bookSortedSet) {
                    if (book.name.equals(keyword)) {
                        System.out.println(book.id);
                        flag = true;
                    }
                }
                break;
            case 2:
                for (Book book : bookSortedSet) {
                    if (book.author.equals(keyword)) {
                        System.out.println(book.id);
                        flag = true;
                    }
                }
                break;
            case 3:
                for (Book book : bookSortedSet) {
                    for (String s : book.keywords) {
                        if (s.equals(keyword)) {
                            System.out.println(book.id);
                            flag = true;
                        }
                    }
                }
                break;
            case 4:
                for (Book book : bookSortedSet) {
                    if (book.publisher.equals(keyword)) {
                        System.out.println(book.id);
                        flag = true;
                    }
                }
                break;
            case 5:
                for (Book book : bookSortedSet) {
                    if (book.publishedYear == Integer.valueOf(keyword)) {
                        System.out.println(book.id);
                        flag = true;
                    }
                }
                break;
            default:
                break;
        }
        if (!flag) {
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bookNum = Integer.valueOf(in.nextLine());
        for (int i = 0; i < bookNum; i++) {
            Book book = new Book();
            book.id = Integer.valueOf(in.nextLine());
            book.name = in.nextLine();
            book.author = in.nextLine();
            String keywords = in.nextLine();
            book.keywords = new ArrayList<>(Arrays.asList(keywords.split(" ")));
            book.publisher = in.nextLine();
            book.publishedYear = Integer.valueOf(in.nextLine());
            bookSortedSet.add(book);
        }
        int queryNum = Integer.valueOf(in.nextLine());
        for (int i = 0; i < queryNum; i++) {
            String line = in.nextLine();
            getResult(line);

        }
    }
}

class Book {
    int id;
    String name;
    String author;
    List<String> keywords;
    String publisher;
    int publishedYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}