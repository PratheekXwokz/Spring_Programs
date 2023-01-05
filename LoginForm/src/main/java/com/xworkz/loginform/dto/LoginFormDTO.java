package com.xworkz.loginform.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
@Table(name = "login_form")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select login from LoginFormDTO login"),
		@NamedQuery(name = "findByUserName", query = "select login from LoginFormDTO login where login.userName=:nm ") })
public class LoginFormDTO {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private Integer id; 
	private String userName;
	private String email;
	private String fileName;

}
