package com.auth0.samples.bootfaces.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;

@Scope(value = "session")
@Component(value = "helloController")
@ELBeanName(value = "helloController")
@Join(path = "/hello", to = "/index.jsf")
@ManagedBean
public class HelloController {
	@Autowired
	public String showHello(){
		return "hello from managed bean";
	}
}
