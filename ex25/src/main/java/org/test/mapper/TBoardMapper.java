package org.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.test.domain.TBoardVO;

public interface TBoardMapper {
//@Select("select * from test_board where bno > 0")
public List<TBoardVO> getList();

public void insert(TBoardVO tboard);

public void insertSelectKey(TBoardVO tboard);

List<TBoardVO> getList2();
}
