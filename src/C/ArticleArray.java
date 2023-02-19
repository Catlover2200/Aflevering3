package C;

import java.util.ArrayList;

public class ArticleArray {
    public static void exC() {
        ArrayList<Article> listOfArticles = new ArrayList<>();
        Article Peculiar = new Article("Ransom Riggs", "Hollow city");
        Article HG = new Article("Suzanne Collins", "Catching fire");
        Article Handmaiden = new Article("Margaret Atwood", "Handmaiden's tale");
        Article Coraline = new Article("Neil Gaiman", "Coraline");
        Article Rosemary = new Article("Ira Levin", "Rosemary's baby");

        listOfArticles.add(Peculiar);
        listOfArticles.add(HG);
        listOfArticles.add(Handmaiden);
        listOfArticles.add(Coraline);
        listOfArticles.add(Rosemary);

        System.out.println(listOfArticles);

    }

}
