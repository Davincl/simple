package com.simple.frame.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class MngrVo {

    @Id
    @GeneratedValue
    private Long no;

    @Column
    private String mngrId;

    @Column
    private String mngrPassWord;

    @Column
    private String mngrName;

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
