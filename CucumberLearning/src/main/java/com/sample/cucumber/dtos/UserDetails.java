package com.sample.cucumber.dtos;

import cucumber.deps.com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetails {

    @XStreamAlias("FirstName")
    private String firstName;
    @XStreamAlias("Email")
    private String email;
    @XStreamAlias("Website")
    private String website;
    @XStreamAlias("Experience")
    private String experience;
    @XStreamAlias("Expertise")
    private String expertise;
    @XStreamAlias("Education")
    private String education;
    @XStreamAlias("Comments")
    private String comments;
}
