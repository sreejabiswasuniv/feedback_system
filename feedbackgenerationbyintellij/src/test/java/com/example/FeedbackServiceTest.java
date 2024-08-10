package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.entity.Feedback;
import com.example.service.FeedbackService;
import com.example.service.FeedbackServiceImpl;

class FeedbackServiceTest {

    private FeedbackService feedbackService;

    @BeforeEach
    void setUp() {
        feedbackService = new FeedbackServiceImpl();
    }

    @Test
    void testAddFeedback() {
        Feedback feedback = new Feedback(1, "SONY TV", "Great Product", true, "sreeja@gmail.com");
        feedbackService.addFeedback(feedback);

        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
        assertEquals(1, feedbacks.size());
        assertEquals("Great Product", feedbacks.get(0).getFeedbackContents());
    }

    @Test
    void testGetFeedbackByEmail() {
        Feedback feedback = new Feedback(2, "SAMSUNG MOBILE", "AMAZING", false, "rahul@gmail.com");
        feedbackService.addFeedback(feedback);

        List<Feedback> feedbacks = feedbackService.getFeedbackByEmail("rahul@gmail.com");
        assertEquals(1, feedbacks.size());

    }

    @Test
    void testGetFeedbackByNature() {
        Feedback feedback = new Feedback(3, "SHOES", "NOT BAD", false, "stuti@gmail.com");
        feedbackService.addFeedback(feedback);

        List<Feedback> feedbacks = feedbackService.getFeedbackByNature(false);
        assertEquals(1, feedbacks.size());
        assertEquals("NOT BAD", feedbacks.get(0).getFeedbackContents());
    }

    @Test
    void testUpdateFeedback() {
        Feedback feedback = new Feedback(4, "AC", "EXCELLENT", true, "shrestha@gmail.com");
        feedbackService.addFeedback(feedback);

        Feedback updatedFeedback = new Feedback(4, "AC", "EXCELLENT", true, "shrestha@gmail.com");
        feedbackService.updateFeedback(4, updatedFeedback);

        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
        assertEquals(1, feedbacks.size());
        assertEquals("EXCELLENT", feedbacks.get(0).getFeedbackContents());
    }

    @Test
    void testDeleteFeedback() {
        Feedback feedback = new Feedback(5, "Fridge", "Not satisfactory", false, "sreeja@gmail.com");
        feedbackService.addFeedback(feedback);

        feedbackService.deleteFeedback(5);

        List<Feedback> feedbacks = feedbackService.getAllFeedbacks();
        assertTrue(feedbacks.isEmpty());
    }
}
