package com.placementmanagementsystem.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	@Column(length = 50, nullable = false)
	@NotBlank(message = "Please Enter Student Name")
	@Size(min = 4, max = 24, message = "Minimum character must be 4 and Maximum character should be 24")
	private String studentName;

	@Column(length = 25, nullable = false)
	@NotBlank(message = "Please Enter Student Email Address")
	@Email(message = "Please Enter Correct Email Address")
	private String studentEmail;

	@Column(length = 25, nullable = false)
	@NotBlank(message = "Please Enter Student Contact Number")
	@Size(min = 10, max = 10, message = "Student Contact Number length should be 10 only")
	private String studentContact;

	@Column(length = 25, nullable = true)
	/* @NotBlank(message = "Please Enter Student Address") */
	/* @Size(min=5, max=20,message = "Please Enter Address") */
	private String studentAddress;

	@Column(length = 25, nullable = true)
	private String studentGender;

	@Column(length = 50, nullable = true)
	private Date studentBirthdate;

	
	  @Column
	  private String studentPhoto;
	  
	  @Column
	  private String studentResume;
	  
	  @Column
	  private String studentDegree;
	  
	  @Column
	  private String studentEducationBranch;
	  
	 
}
