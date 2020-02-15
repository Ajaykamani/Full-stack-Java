package com.cts.training.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class NewsFeed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	@Column
	private Integer feedId;
	@Column
	private Integer mediaId;
	@Column
	 private LocalDateTime createdOn;
	public NewsFeed() {
		
	}
	public NewsFeed(Integer id, Integer userId,Integer mediaId,Integer feedId,LocalDateTime createdOn) {
		super();
		this.id = id;
		this.userId = userId;
		this.mediaId=mediaId;
		this.feedId=feedId;
		this.createdOn=createdOn;
				
		}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getFeedId() {
		return feedId;
	}
	public void setFeedId(Integer feedId) {
		this.feedId = feedId;
	}
	public Integer getMediaId() {
		return mediaId;
	}
	public void setMediaId(Integer mediaId) {
		this.mediaId = mediaId;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public String toString() {
		return "NewsFeed [id=" + id + ", userId=" + userId + ", mediaId=" +mediaId +", feedId="+ feedId+", createdOn=" + createdOn + "]";
		}
}
