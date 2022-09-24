package com.example.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	@Id
	private Integer id;
	private String name;
	private String email;

	public Integer getId() {
        return id;
    }

	public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
