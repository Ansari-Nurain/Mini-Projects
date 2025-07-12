package com.third_party_api.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Posts {
	private int userId;
	private long id;
	private String title;
	private String body;
	

}
