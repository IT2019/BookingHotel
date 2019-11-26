package minhson.springofson.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import minhson.springofson.model.Emp;

public class EmpMapper implements RowMapper<Emp>{
	public static final String BASE_SQL = "select * from employee";
    @Override
    public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int salary = rs.getInt("salary");
        String designation = rs.getString("designation");
 
        return new Emp(id, name, salary, designation);
    }
}
