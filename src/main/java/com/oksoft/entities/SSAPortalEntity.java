package com.oksoft.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="SSA_PORTAL_DTLS")
public class SSAPortalEntity {
    @Id
    @GenericGenerator(name="ssa_prtl_no_gen",strategy="com.oksoft.generators.SsnIdGenerator")
    @GeneratedValue(generator="ssa_prtl_no_gen")
    @Column(name="SSA_PRTL_NO") 
	private Long ssn;
	@Column(name="FIRST_NAME")
    private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="GENDER")
	private String gender;
	@Column(name="DATE_OF_BIRTH")
	private Date DateOfBirth;
	@Column(name="STATE_NAME")
	private String stateName;
	@CreationTimestamp
	@Column(name="CREATED_DATE",updatable=false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE",insertable=false)
	private Date updatedDate;
}
