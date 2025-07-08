package org.zerok.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;
import org.zerock.sample.SampleHotel;

import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class) // 메서드 단위로 테스트용 코드
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 테스트시 사용될 코드
@Log4j2 //  Lg4j가 취약해서  Log4j2 로 교체함.
public class HotelTests {

	@Setter(onMethod_ = @Autowired)	
	private SampleHotel hotel; // new sampleHotel(chef);
	
	@Test
	public void testExits() {
		assertNotNull(hotel);
		
		log.info(hotel);
		log.info("--------------------------");
		log.info(hotel.getChef());
		//INFO  org.zerok.sample.HotelTests(testExist29) - SampleHotel(chef=Chef(name=null, age=0))
		//INFO  org.zerok.sample.HotelTests(testExist30) - --------------------------
		//INFO  org.zerok.sample.HotelTests(testExist31) - Chef(name=null, age=0)
	}
}
