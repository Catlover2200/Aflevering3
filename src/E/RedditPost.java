package E;

import java.time.LocalDate;

public class RedditPost {
    private LocalDate postDate;
    private String author;
    private int voteBalance;
    private String title;

    public RedditPost(String author, String title) {
        this.postDate = LocalDate.now();
        this.author = author;
        this.voteBalance = 1;
        this.title = title;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public String getAuthor() {
        return author;
    }

    public int getVoteBalance() {
        return voteBalance;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate setPostDate(LocalDate newPostdate) {
        return newPostdate;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public int setVoteBalance(int newVoteBalance) {
        return newVoteBalance;
    }

    public void setTitle(String NewTitle) {
        this.title = NewTitle;
    }

    @Override
    public String toString() {
        return "RedditPost {" +
                "Posted on: " + postDate +
                ", Title: " + title +
                ", Author: " + author +
                ", Vote balance: " + voteBalance +
                "} ";
    }
}
