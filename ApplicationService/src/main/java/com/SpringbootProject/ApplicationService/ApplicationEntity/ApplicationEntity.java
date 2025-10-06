package com.SpringbootProject.ApplicationService.ApplicationEntity;


import jakarta.persistence.*;

    @Entity
    @Table(name = "applications")
    public class ApplicationEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto-increment id
        private Long id;

        @Column(nullable = false)
        private Long jobId;   // FK to Job table

        @Column(nullable = false)
        private String seekerUsername;  // taken from JWT token

        // Default constructor
        public ApplicationEntity() {
        }

        // Constructor with fields
        public ApplicationEntity(Long jobId, String seekerUsername) {
            this.jobId = jobId;
            this.seekerUsername = seekerUsername;
        }

        // Getters and Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getJobId() {
            return jobId;
        }

        public void setJobId(Long jobId) {
            this.jobId = jobId;
        }

        public String getSeekerUsername() {
            return seekerUsername;
        }

        public void setSeekerUsername(String seekerUsername) {
            this.seekerUsername = seekerUsername;
        }
    }


