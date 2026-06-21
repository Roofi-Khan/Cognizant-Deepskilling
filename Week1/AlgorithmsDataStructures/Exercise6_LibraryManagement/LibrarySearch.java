package Week1.AlgorithmsDataStructures.Exercise6_LibraryManagement;

public class LibrarySearch {

    static Book linearSearch(
            Book[] books,
            String title) {

        for(Book b : books) {

            if(b.title.equalsIgnoreCase(title))
                return b;
        }

        return null;
    }

    static Book binarySearch(
            Book[] books,
            String title) {

        int left = 0;
        int right = books.length - 1;

        while(left <= right) {

            int mid = (left+right)/2;

            int result =
                books[mid].title.compareToIgnoreCase(title);

            if(result == 0)
                return books[mid];

            if(result < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }
}
