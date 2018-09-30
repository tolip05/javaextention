import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Badvance7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // ArrayList<Book>books = new ArrayList<>();
        BookLibrary library = new BookLibrary(){{
            setName("Prosveta");
            setBooks(new ArrayList<>());
        }};
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        int booksCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < booksCount; i++) {
            String []tokens = scanner.nextLine().split(" ");
            Book book = new Book(){{
                setTitle(tokens[0]);
                setAuthor(tokens[1]);
                setPublisher(tokens[2]);
                setReleaseDate(LocalDate.parse(tokens[3],df));
                setIsbn(tokens[4]);
                setPrice(Double.parseDouble(tokens[5]));
            }};
            library.getBooks().add(book);
        }
        library.getBooks().stream()
                .collect(Collectors.groupingBy(b -> b.getAuthor(),Collectors.summingDouble(Book::getPrice)))
        .entrySet()
                .stream()
                .sorted((a,b) ->{
            int compaerResult=Double.compare(b.getValue(),a.getValue());
            if (compaerResult == 0){
                compaerResult = a.getKey().compareTo(b.getKey());
            }
            return compaerResult;
                })
                .forEach((kvp)->{
        String author = kvp.getKey();
        Double totalSum = kvp.getValue();
                    System.out.printf("%s -> %.2f%n",author,totalSum);
        });

    }
}