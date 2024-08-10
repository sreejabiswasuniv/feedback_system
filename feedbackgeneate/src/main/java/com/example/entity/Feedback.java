package com.example.entity;

public class Feedback {
	private int id;
	private String productName;
	private String feedbackContents;
	private boolean feedbackNature;
	private String feedbackEmail;

	public Feedback() {
	}

	public Feedback(int id, String productName, String feedbackContents, boolean feedbackNature, String feedbackEmail) {
		this.id = id;
		this.productName = productName;
		this.feedbackContents = feedbackContents;
		this.feedbackNature = feedbackNature;
		this.feedbackEmail = feedbackEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getFeedbackContents() {
		return feedbackContents;
	}

	public void setFeedbackContents(String feedbackContents) {
		this.feedbackContents = feedbackContents;
	}

	public boolean isFeedbackNature() {
		return feedbackNature;
	}

	public void setFeedbackNature(boolean feedbackNature) {
		this.feedbackNature = feedbackNature;
	}

	public String getFeedbackEmail() {
		return feedbackEmail;
	}

	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}
}
