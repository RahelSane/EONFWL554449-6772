package com.placementmanagementsystem.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

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
public class AppliedJob 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appliedjobId;
	
	@Column
	private String Status;
	
	@ManyToOne
	private JobDetails jobdetails;
	
	@ManyToOne
	private StudentDetails studentdetails;
	
}
