package io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.RecommendationSystem;

import io.github.premwadhwani24.resumeanalyzer.resumeanalyzer.Job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImplRecommendationService<Recommendation> implements RecommendationService {

    private final List<Recommendation> recommendations;

    public ImplRecommendationService() {
        this.recommendations = new ArrayList<>();
    }

    @Override
    public Recommendation createRecommendation(Recommendation recommendation) {
        recommendations.add(recommendation);
        return recommendation;
    }

    @Override
    public List<Recommendation> getAllRecommendation() {
        return recommendations;
    }

    @Override
    public Recommendation getRecommendationByTitle(String title) {
        for (Recommendation recommendation : recommendations) {
            if (recommendation.getTitle().equalsIgnoreCase(title)) {
                return recommendation;
            }
        }
        return null;
    }

    @Override
    public Recommendation getRecommendationByCompany(String company) {
        if (company == null || company.isEmpty()) {
            return null;
        }
        for (Recommendation recommendation : recommendations) {
            if (recommendation.getCompany() != null && recommendation.getCompany().equalsIgnoreCase(company)) {
                return recommendation;
            }
        }
        return null;
    }

    @Override
    public Recommendation getRecommendationBySkills(String skills) {
        for (Recommendation recommendation : recommendations) {
            if (recommendation.getSkills().equalsIgnoreCase(skills)) {
                return recommendation;
            }
        }
        return null;
    }

    @Override
    public Recommendation getRecommendationBySkillRequired(String skillRequired) {
        for (Recommendation recommendation : recommendations) {
            if (recommendation.getSkillRequired().equalsIgnoreCase(skillRequired)) {
                return recommendation;
            }
        }
        return null;
    }
}
