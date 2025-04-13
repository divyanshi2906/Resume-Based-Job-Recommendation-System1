package io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.Job;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // Marks this class as a Spring service component to be managed by the Spring container
public class ImplJobService implements JobService {

    private final List<Job> jobs; // A list to store job objects

    // Constructor to initialize the jobs list
    public ImplJobService() {
        this.jobs = new ArrayList<>();
    }

    // Method to create and add a job to the list
    @Override
    public Job createJob(Job job) {
        jobs.add(job); // Adds the job to the list
        return job; // Returns the created job
    }

    // Method to retrieve all jobs in the list
    @Override
    public List<Job> getAllJobs() {
        return jobs; // Returns the list of all jobs
    }

    // Method to retrieve a job by its title
    @Override
    public Job getJobByTitle(String title) {
        for (Job job : jobs) { // Iterates through each job in the list
            if (job.getTitle().equals(title)) { // Compares the job title with the given title
                return job; // If a match is found, returns the job
            }
        }
        return null; // Returns null if no job with the given title is found
    }

    // Method to retrieve a job by the company name
    @Override
    public Job getJobByCompany(String company) {
        for (Job job : jobs) { // Iterates through each job in the list
            if (job.getCompany().equals(company)) { // Compares the job's company with the given company name
                return job; // If a match is found, returns the job
            }
        }
        return null; // Returns null if no job with the given company is found
    }

    // Method to retrieve a job by location
    @Override
    public Job getJobByLocation(String location) {
        for (Job job : jobs) { // Iterates through each job in the list
            if (job.getLocation().equals(location)) { // Compares the job's location with the given location
                return job; // If a match is found, returns the job
            }
        }
        return null; // Returns null if no job with the given location is found
    }

    // Method to retrieve a job by its description
    @Override
    public Job getJobByDescription(String description) {
        for (Job job : jobs) { // Iterates through each job in the list
            if (job.getDescription().equals(description)) { // Compares the job's description with the given description
                return job; // If a match is found, returns the job
            }
        }
        return null; // Returns null if no job with the given description is found
    }

    // Method to retrieve a job by skills (Note: This seems incorrect as you're checking company instead of skills)
    @Override
    public Job getJobBYSkills(String skills) {
        for (Job job : jobs) { // Iterates through each job in the list
            if (job.getCompany().equals(skills)) { // This condition seems incorrect, it should be job.getSkills() instead of job.getCompany()
                return job;
            }
        }
        return null;
    }
}
