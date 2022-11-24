package com.springboot.iroiro.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class SimpleMessageDAO {
    @Autowired JdbcTemplate jt;

    public List<Map<String, ?>> selectAll() {

        return jt.query("select * from testtable", (rs, rowNum) -> {
            Map<String, Object> mss = new HashMap<>();
            mss.put("idx", rs.getInt(1));
            mss.put("name", rs.getString(2));
            return mss;
        });
    }
}