package minhson.springofson.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import minhson.springofson.mapper.EmpMapper;
import minhson.springofson.model.Emp;

@Repository
@Transactional
public class EmpDao extends JdbcDaoSupport {
	@Autowired
    public EmpDao(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
	public List<Emp> listEmp() {
        String sql = EmpMapper.BASE_SQL;
 
        Object[] params = new Object[] {};
        EmpMapper mapper = new EmpMapper();
 
        List<Emp> list = this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }
}
