package javase.project.forumservice.bll.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
        private static int AUTO_INCREMENT = 0;
        private int id;
        private String title;
        private LocalDate createdOn;

        private List<Post> postList = new ArrayList<>();

        public Forum(String title, LocalDate createdOn, List<Post> postList) {
            this.id = AUTO_INCREMENT++;
            this.title = title;
            this.createdOn = createdOn;
            this.postList = postList;
        }

        //constructeur sans liste de posts... On ajoute les posts grace à la méthode 'addPost()'
        public Forum( String title, LocalDate createdOn) {
            this.id = id;
            this.title = title;
            this.createdOn = createdOn;
        }

        //MÉTHODES DE LISTES->
        public void addPosts(Post newPost){
            this.postList.add(newPost);
        }

        public List<Post> getPosts(){
            return this.postList;
        }

        //MÉTHODES UTILITAIRES ->

        @Override
        public String toString() {
            return "Forum{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", createdOn=" + createdOn +
                    ", postList=" + postList +
                    '}';
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public LocalDate getCreatedOn() {
            return createdOn;
        }

        public void setCreatedOn(LocalDate createdOn) {
            this.createdOn = createdOn;
       }
}


