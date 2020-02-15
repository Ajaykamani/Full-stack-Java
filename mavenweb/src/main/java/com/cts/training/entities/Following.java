package com.cts.training.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Following {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column
	private Integer userId;
	@Column
	private Integer followerId;
	
	public Following(Integer followerId, Integer userId) {
		super();
		this.followerId = followerId;
		this.userId = userId;

}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Integer followerId) {
		this.followerId = followerId;
	}
	
	public String toString() {
		return "Following [userId=" + userId + ", followerId=" + followerId + "]";
		}
	
	
}
