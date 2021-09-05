package com.codecool.spingboot_tasks.jdbc_template.repository;

import com.codecool.spingboot_tasks.jdbc_template.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IdRowMapper implements RowMapper<Integer> {
    @Override
    public Integer mapRow(ResultSet rs, int i) throws SQLException {
        return rs.getInt("id");
    }
}
