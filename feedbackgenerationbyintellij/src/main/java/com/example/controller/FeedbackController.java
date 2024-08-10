package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Feedback;
import com.example.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping("/all")
    public List<Feedback> getAllFeedback() {
        System.out.println("All feedbbacks are fetched!!");
        return feedbackService.getAllFeedbacks();
    }

    @PostMapping
    public String addFeedback(@RequestBody Feedback feedback) {
        feedbackService.addFeedback(feedback);

        return "Added feedback with ID: " + feedback.getId();
    }

    @PutMapping("/{id}")
    public String updateFeedback(@PathVariable int id, @RequestBody Feedback feedback) {
        feedbackService.updateFeedback(id, feedback);

        return "Updated feedback with ID: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteFeedback(@PathVariable int id) {
        feedbackService.deleteFeedback(id);

        return "Deleted feedback with ID: " + id;
    }

    @GetMapping("/email")
    public List<Feedback> getFeedbackByEmail(@RequestParam String email) {
        System.out.println("Fetching feedbacks by email: " + email);
        return feedbackService.getFeedbackByEmail(email);
    }

    @GetMapping("/nature")
    public List<Feedback> getFeedbackByNature(@RequestParam boolean nature) {
        System.out.println("Fetching feedbacks by nature: " + nature);
        return feedbackService.getFeedbackByNature(nature);
    }
}
