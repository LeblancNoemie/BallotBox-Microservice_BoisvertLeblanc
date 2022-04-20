package com.example.electeurservice.bll.model;

import java.util.ArrayList;
import java.util.List;

public class Electeur {
        private static int AUTO_INCREMENT = 0;
        private int id;
        private String login;
        private String password;
        private int weight;
        private String email;
        private int voterId;

        //todo a supprimer?
        private List<Integer> postsID = new ArrayList<>();
        private List<Integer> ownedPollsID = new ArrayList<>();
        private List<Integer> openPollsID = new ArrayList<>();
        private List<Integer> votesID = new ArrayList<>();

        public Electeur(String login, String password, int weight, String email) {
            this.id = AUTO_INCREMENT++;
            this.login = login;
            this.password = password;
            this.weight = weight;
            this.email = email;
            this.voterId = voterId;
        }

        //MÉTHODES UTILITAIRES ->
        @Override
        public String toString() {
            return "Elector{" +
                    "id=" + id +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", weight=" + weight +
                    ", email='" + email + '\'' +
                    ", voterId=" + voterId +
                    ", posts=" + postsID +
                    ", ownedPolls=" + ownedPollsID +
                    ", openPolls=" + openPollsID +
                    ", votes=" + votesID +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getVoterId() {
            return voterId;
        }

        public void setVoterId(int voterId) {
            this.voterId = voterId;
        }
}

