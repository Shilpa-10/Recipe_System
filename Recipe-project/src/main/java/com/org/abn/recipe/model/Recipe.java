package com.org.abn.recipe.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "recipe")
// @EntityListeners(AuditingEntityListener.class)
// @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Recipe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1788477531567320660L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotBlank
	@Column(name = "name1")
	private String name1;

	@Column(name = "category")
	@NotBlank
	private String category;

	@Column(name = "detail")
	@NotBlank
	private String detail;

	@Column(name = "veg_or_nonveg")
	@NotBlank
	private String vegOrNonveg;

	// @LastModifiedDate
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getVegOrNonveg() {
		return vegOrNonveg;
	}

	public void setVegOrNonveg(String vegOrNonveg) {
		this.vegOrNonveg = vegOrNonveg;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
