package com.simple.frame.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
public class BoardVo {

    @Id
    @GeneratedValue
    private Long id;

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

}
