package F;

import E.RedditPost;

import java.util.ArrayList;

public class RedditFrontPage {
    private static ArrayList<RedditPost> redditArrayPage;

    public static void exF() {
        redditArrayPage = new ArrayList<>();

        RedditPost Treetrunks = new RedditPost("u/BulmasBabyD1", "Tree Trunks is a 'top 5' character");
        RedditPost Card = new RedditPost("u/NoGhostRdt", "Card #005 - Banana guard");
        RedditPost Books = new RedditPost("u/Ok_Collar6502","Do you have any authors who are automatic reads? Authors who, if they released a book tomorrow, you know with 100% certainty that you will read.");

        redditArrayPage.add(Treetrunks);
        redditArrayPage.add(Card);
        redditArrayPage.add(Books);

        System.out.println("Not refreshed" + redditArrayPage);

        deleteRedditPost(2);

        System.out.println("Refreshed page" + redditArrayPage);


    }
public static void deleteRedditPost(int removeIndex) {
    System.out.println("The deleted post: " + redditArrayPage.remove(removeIndex));
}


}
