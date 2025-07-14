package org.test.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.test.domain.TBoardVO;
import org.test.service.TBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TBoardServiceTests {
	
	@Setter(onMethod_ = @Autowired)
	private TBoardService service;
	
	@Test
	
	public void testExist() {
		
		log.info("==================");
		log.info(service); // 인터페이스를 호출해보자.
		assertNotNull(service); // 빈객체가 아님을 테스트 한다.
		log.info("=================="); 
	}
	
	@Test
	public void testRegister() {
		
		TBoardVO tboard = new TBoardVO();
		tboard.setTitle("서비스 에서 만든 제목");
		tboard.setContent("서비스 에서 만든 내용");
		tboard.setWriter("서비스 님");
		
		service.register(tboard);
		
		log.info("======================");
		log.info("생성된 게시물의 번호 : " + tboard.getBno());
		log.info("======================");
		
	}
}
