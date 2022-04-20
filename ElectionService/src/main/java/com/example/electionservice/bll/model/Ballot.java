package com.example.electionservice.bll.model;
import java.time.LocalDate;

public class Ballot {

        private static int AUTO_INCREMENT = 0;
        private int id;
        private String title;
        private LocalDate start;
        private LocalDate end;
        private boolean isPublic;
        private boolean isAnonymous;

        private int forumID;
        private int ownerElectorID;

        public Ballot(String title, LocalDate start, LocalDate end, boolean isPublic, boolean isAnonymous, int forum, int owner) {
            this.id = AUTO_INCREMENT++;
            this.title = title;
            this.start = start;
            this.end = end;
            this.isPublic = isPublic;
            this.isAnonymous = isAnonymous;
            this.forumID = forum;
            this.ownerElectorID = owner;
        }

        // Getter Setter \/\/
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

        public LocalDate getStart() {
            return start;
        }

        public void setStart(LocalDate start) {
            this.start = start;
        }

        public LocalDate getEnd() {
            return end;
        }

        public void setEnd(LocalDate end) {
            this.end = end;
        }

        public boolean isPublic() {
            return isPublic;
        }

        public void setPublic(boolean aPublic) {
            isPublic = aPublic;
        }

        public boolean isAnonymous() {
            return isAnonymous;
        }

        public void setAnonymous(boolean anonymous) {
            isAnonymous = anonymous;
        }
}

