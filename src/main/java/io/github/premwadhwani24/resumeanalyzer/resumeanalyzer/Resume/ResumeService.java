package io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.Resume;

import java.util.List;
public interface ResumeService {

    Resume createResume(Resume resume);

    List<Resume> getAllResume();
    Resume getResumeById(long id);

    Resume getResumeByFileName(String fileName);

    Resume getResumeByParsedSkills(String parsedSkills);

    Resume getResumeByUpload(String uploadAt);

    Resume getResumeByUser(String user);
}

