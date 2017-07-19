package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by rickiecashwell on 7/1/17.
 */
@Component
public class MyRepo {
    final
    JdbcTemplate template;

    @Autowired
    public MyRepo(JdbcTemplate template) {
        this.template = template;
    }

    public Word getWordbyId(Integer id){
       return template.queryForObject("Select * from names" +
                " Where id = ?",
                new Object[]{id},
                (ResultSet,row) -> new Word(
                        ResultSet.getInt("id"),
                        ResultSet.getString("first")

                ));

    }
}
