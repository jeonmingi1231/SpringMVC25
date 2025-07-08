package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Data;
@Component // 스프링의 의존성 처리해줘!!!
@Data 	// import lombok.Data; dto 처리용 
public class Chef {

	private String name;
	private int age;
}
