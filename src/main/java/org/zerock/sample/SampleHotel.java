package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component // org.springframework.stereotype.Component;
@ToString  // lombok.Getter;
@Getter	   // lombok.ToString;
// @AllArgsConstructor // 모든 필드값을 이용해서 생성자 주입
@RequiredArgsConstructor // NonNull 만 생성자로 넣음.
public class SampleHotel {
	// 목시적 자동 주입 : 
	// 스프링의 의존성 주입은 생성자 주입과 세터 주입을 자주 사용한다.
	// 생성자 주입은 롬북이 알아서 파라미터를 만들어 줌.
	// 세터 주입은 값을 저장시 자동 객체를 생성해줌.
	// 세터 주입은 값을 저장시 자동 객체를 생성해줌. @Setter(onMethod_ = @Autowired)
	
	private Chef chef; // 필드
	
	private Restaurant restaurant;
	
	@NonNull
	private String name;
	

}
