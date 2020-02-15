package com.cts.training.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BlockedUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer userId;
	@Column
	private Integer blockedUserId;
	
	public BlockedUser(Integer blockedUserId, Integer userId) {
		super();
		this.blockedUserId = blockedUserId;
		this.userId = userId;

}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBlockedUserId() {
		return blockedUserId;
	}

	public void setBlockedUserId(Integer blockedUserId) {
		this.blockedUserId = blockedUserId;
	}
	public String toString() {
		return "NewsFeed [ userId=" + userId + ", blockedUserId=" +blockedUserId + "]";
		}
	
	

}
