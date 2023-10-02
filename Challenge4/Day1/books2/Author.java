package Challenge4.Day1.books2;

public class Author {
    private String authorName;
    private Date bornDate;

    public Author(String authorName, Date bornDate) {
        this.authorName = authorName;
        this.bornDate = bornDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }
}
