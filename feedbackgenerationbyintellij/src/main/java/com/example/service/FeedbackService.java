package com.example.service;

import java.util.List;

import com.example.entity.Feedback;

public interface FeedbackService {
    List<Feedback> getAllFeedbacks();

    List<Feedback> getFeedbackByEmail(String email);

    List<Feedback> getFeedbackByNature(boolean nature);

    void addFeedback(Feedback feedback);

    void updateFeedback(int id, Feedback feedback);

    void deleteFeedback(int id);

}
