package com.simple.frame.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class BoardVo {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Integer num;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String name;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date regDt;

    @Column
    private Long regId;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updDt;

    @Column
    private Long uptId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	public Long getRegId() {
		return regId;
	}

	public void setRegId(Long regId) {
		this.regId = regId;
	}

	public Date getUpdDt() {
		return updDt;
	}

	public void setUpdDt(Date updDt) {
		this.updDt = updDt;
	}

	public Long getUptId() {
		return uptId;
	}

	public void setUptId(Long uptId) {
		this.uptId = uptId;
	}

}
