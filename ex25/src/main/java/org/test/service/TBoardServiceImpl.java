package org.test.service;

import java.util.List;

import org.test.domain.TBoardVO;
import org.test.mapper.TBoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@AllArgsConstructor
@Log4j2
public class TBoardServiceImpl implements TBoardService {

	private TBoardMapper tbmapper;

	@Override
	public void register(TBoardVO tboard) {
		// 객체가 넘어오면 메퍼를 이용해서 데이터베이스에 등록함

		log.info("BoardServiceImpl.register메서드 실행.....");

		tbmapper.insertSelectKey(tboard);
		log.info("정상등록 후 리스트 출력테스트......");
		tbmapper.getList2();
	}

}
