package com.unidev.app.servicemonitoring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "http_monitoring")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HTTPMonitoring {


    @Id
    @GeneratedValue
    private Long id;

    private String url;

}
