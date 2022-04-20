package com.example.candidatservice.bll.model;
import java.util.ArrayList;
import java.util.List;

public class Candidat {
        private static int AUTO_INCREMENT = 0;
        private int id;
        private String name;
        private String description;
        private String image;

        private int ballotID;

        public Candidat(String name, String description, String image, int poll)
        {
            this.id = AUTO_INCREMENT++;
            this.name = name;
            this.description = description;
            this.image = image;
            this.ballotID = poll;
        }

        public Candidat(String name, String description, String image)
        {
            this.id = AUTO_INCREMENT++;
            this.name = name;
            this.description = description;
            this.image = image;
        }

        // Getter Setter \/\/

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
}

