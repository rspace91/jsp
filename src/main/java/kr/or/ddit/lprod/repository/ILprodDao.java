package kr.or.ddit.lprod.repository;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.model.Lprod;

public interface ILprodDao {
	
		List<Lprod> getLprodList() ;
}
