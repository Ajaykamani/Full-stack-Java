package com.cts.training.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Actions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private Integer userId;
	
	@Column
	private Integer mediaId;
	
	@Column
	private LocalDateTime createdOn;
	private Boolean status;
	


	public Actions(Integer id, Integer userId, Integer mediaId, LocalDateTime createdOn,Boolean status) {
	super();
	this.id = id;
	this.userId = userId;
	this.mediaId=mediaId;
	this.createdOn = createdOn;
	this.status=status;
	
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
	public Integer getMediaId(Integer mediaId) {
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
	public Boolean getStatus(Boolean status) {
		return status;
		}
		public void setStatus(Boolean status) {
			this.status = status;
		}
	
	
	
	@Override
	public String toString() {
	return "Media [id=" + id + ", userId=" + userId + ",mediaId=" + mediaId
	+ ", status=" + status + ", createdOn=" + createdOn + "]";
	}

	}