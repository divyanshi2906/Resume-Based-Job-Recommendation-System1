package io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.Resume;

// Importing Spring's @Service annotation to mark this class as a Spring service
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service // Marks this class as a service component for Spring to manage
public class ImplResumeService implements ResumeService {

    // In-memory list to store resumes (could later be replaced with a database)
    private final List<Resume> resumes;

    // Constructor that initializes the list
    public ImplResumeService() {
        this.resumes = new ArrayList<Resume>();
    }

    // Adds a resume to the list and returns it
    @Override
    public Resume createResume(Resume resume) {
        resumes.add(resume);
        return resume;
    }

    // Returns all resumes

    public List<Resume> getAllResumes() {
        return resumes;
    }

    // Finds a resume by its ID

    public Resume getResumeBYId(long Id) {
        for (Resume resume : resumes) {
            if (resume.getId() == Id) {
                return resume;
            }
        }
        return null; // Return null if not found
    }

    public Resume getResumeByFileName(Void fileName) {
        for (Resume resume : resumes) {
            if (resume.getFileName().equals(fileName)) {
                return resume;
            }
        }
        return null;
    }

    // Finds a resume by file name
    @Override
    public Resume getResumeByFileName(String fileName) {
        for (Resume resume : resumes) {
            if (resume.getFileName().equals(fileName)) {
                return resume;
            }
        }
        return null;
    }

    // Finds a resume by parsed skills
    public Resume getResumeByParsedSkills(Void parsedSkills) {
        for (Resume resume : resumes) {
            if (resume.getParsedSkills().equals(parsedSkills)) {
                return resume;
            }
        }
        return null;
    }

    // Finds a resume by upload timestamp
    public Resume getResumeByUploadAt(LocalDate uploadAt) {
        for (Resume resume : resumes) {
            if (resume.getUploadedAt().equals(uploadAt)) {
                return resume;
            }
        }
        return null;
    }

    // Finds a resume by user
    @Override
    public Resume getResumeByUser(String user) {
        for (Resume resume : resumes) {
            if (resume.getUser().equals(user)) {
                return resume;
            }
        }
        return null;
    }
}
