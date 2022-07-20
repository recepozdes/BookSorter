public class Book implements Comparable<Book> {
    private String title;
    private int pageNumber;
    private String authorName;
    private String publishDate;

    public Book(String title, int pageNumber, String authorName, String publishDate) {
        this.title = title;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {

        return getTitle().compareTo(o.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
