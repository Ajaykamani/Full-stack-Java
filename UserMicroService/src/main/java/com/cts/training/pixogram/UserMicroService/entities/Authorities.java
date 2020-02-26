package com.cts.training.pixogram.UserMicroService.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "authorities")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Authorities implements Serializable {
	
	

	@Id
	@Column(insertable = true,length = 100)
	private String username;
	@Id
	@Column(insertable = true,length = 100)
	private String authority;
	

}
