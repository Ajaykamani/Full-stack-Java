package com.cts.training.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Comments {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	
	@Column
	private Integer mediaId;
	
	@Column
	private LocalDateTime createdOn;
	@Column
	private String comments;
	
	
	public Comments(Integer id, Integer userId, Integer mediaId, LocalDateTime createdOn,String comments) {
		super();
		this.id = id;
		this.userId = userId;
		this.mediaId=mediaId;
		this.createdOn = createdOn;
		this.comments=comments;
		
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


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}
	public String toString() {
		return "Comments [id=" + id + ", userId=" + userId + ", mediaId=" +mediaId +", comments="+ comments+", createdOn=" + createdOn + "]";
		}
	
	
}
