package org.test.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.test.domain.TBoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class TBoardMapperTests {
@Setter(onMethod_ = @Autowired )
private TBoardMapper mapper;

@Test
public void testGetList() {
	
	mapper.getList().forEach(board -> log.info(board));
}

@Test
public void testInsert() {
	
	TBoardVO tboard = new TBoardVO();
	tboard.setTitle("새로 작성하는 글");
	tboard.setContent("새로 작성하는 내용");
	tboard.setWriter("새로 작성하는 사람");
	
	mapper.insert(tboard);
	
	log.info(tboard);
	
			
}
}
