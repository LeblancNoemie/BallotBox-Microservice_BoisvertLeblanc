package javase.project.forumservice.bll.model;

import java.time.LocalDate;

public class Post {
        private static int AUTO_INCREMENT = 0;
        private int id;
        private LocalDate date;
        private String message;
        private Forum forumSource;

        private Forum forum;
        //private Elector voter;
        private int voterID;

        public Post(LocalDate date, String message, Forum forumSource, Forum forum, int voter) {
            this.id = AUTO_INCREMENT++;
            this.date = date;
            this.message = message;
            this.forumSource = forumSource;
            this.forum = forum;
            this.voterID = voter;
        }

        //MÉTHODES UTILITAIRES ->
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Forum getForumSource() {
            return forumSource;
        }

        public void setForumSource(Forum forumSource) {
            this.forumSource = forumSource;
        }

        public Forum getForum() {
            return forum;
        }

        public void setForum(Forum forum) {
            this.forum = forum;
        }

        public int getVoter() {
            return voterID;
        }

        public void setVoter(int id) {
            this.voterID = id;
        }

        @Override
        public String toString() {
            return "Post{" +
                    "id=" + id +
                    ", date=" + date +
                    ", message='" + message + '\'' +
                    ", forumSource=" + forumSource +
                    ", forum=" + forum +
                    ", voter=" + voterID +
                    '}';
       }
}

