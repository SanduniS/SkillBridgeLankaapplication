package com.SpringbootProject.ApplicationService.ApplicationDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationDTO {

        private Long id;          // application id
        private Long jobId;       // job being applied for
        private String seekerUsername; // extracted from JWT

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




