package com.unidev.app.servicemonitoring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class HTTPMonitoring {


    @Id
    @GeneratedValue
    private Long id;


}
