package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	private List<Feedback> feedbackList = new ArrayList<>();

	@Override
	public List<Feedback> getAllFeedbacks() {
		return feedbackList;
	}

	@Override
	public void addFeedback(Feedback feedback) {
		feedbackList.add(feedback);
	}

	@Override
	public void updateFeedback(int id, Feedback feedback) {
		for (int i = 0; i < feedbackList.size(); i++) {
			Feedback fb = feedbackList.get(i);
			if (fb.getId() == id) {
				feedbackList.set(i, feedback);
				return;
			}
		}
	}

	@Override
	public void deleteFeedback(int id) {
		for (int i = 0; i < feedbackList.size(); i++) {
			if (feedbackList.get(i).getId() == id) {
				feedbackList.remove(i);
				return;
			}
		}
	}

	@Override
	public List<Feedback> getFeedbackByEmail(String email) {
		List<Feedback> result = new ArrayList<>();
		for (Feedback fb : feedbackList) {
			if (fb.getFeedbackEmail().equals(email)) {
				result.add(fb);
			}
		}
		return result;
	}

	@Override
	public List<Feedback> getFeedbackByNature(boolean nature) {
		List<Feedback> result = new ArrayList<>();
		for (Feedback fb : feedbackList) {
			if (fb.isFeedbackNature() == nature) {
				result.add(fb);
			}
		}
		return result;
	}

}
