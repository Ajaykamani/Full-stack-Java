package com.cts.training.pixogram.UserMicroService.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Users {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column
private String username;
@Column
private String password;
@Column
private String email;
@Column
private String firstname;
@Column
private String lastname;
@Column
private LocalDate dob;
@Column
private String url;
@Column
@CreationTimestamp
private LocalDateTime createdon;
@UpdateTimestamp
@Column
private LocalDateTime updatedon;
@Column
private Boolean enabled;

}