package com.example.electionservice.bll.model;
import java.time.LocalDate;

public class Vote {
        private static int AUTO_INCREMENT = 0;
        private int id;
        private LocalDate when;
        private int rank;

        private int candidatID;
        private int voterID;
        private int ballotID;

        public Vote(LocalDate when, int rank, int subject, int voter, int poll) {
            this.when = when;
            this.rank = rank;
            this.candidatID = subject;
            this.voterID = voter;
            this.id = AUTO_INCREMENT++;
            this.ballotID = poll;
        }

        //MÉTHODES UTILITAIRES ->
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public LocalDate getWhen() {
            return when;
        }

        public void setWhen(LocalDate when) {
            this.when = when;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getSubject() {
            return candidatID;
        }

        public void setSubject(int subject) {
            this.candidatID = subject;
        }

        public int getVoter() {
            return voterID;
        }

        public void setVoter(int voter) {
            this.voterID = voter;
        }

        public int getBallotID() {
            return ballotID;
        }

        public void setBallotID(int ballotID) {
            this.ballotID = ballotID;
        }

        @Override
        public String toString() {
            return "Vote{" +
                    "id=" + id +
                    ", when=" + when +
                    ", rank=" + rank +
                    ", subject=" + candidatID+
                    ", voter=" + voterID +
                    '}';
        }
}

