package kr.kh.temp.dao;

import org.apache.ibatis.annotations.Param;

public interface PostDAO {

	boolean insertBoard(@Param("name")String name);

}
