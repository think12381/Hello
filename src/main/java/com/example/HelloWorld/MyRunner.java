package com.example.HelloWorld;

import com.example.HelloWorld.Service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;


@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    JdbcTemplate jdbcTemplate1;
    private static final Logger LOGGER = LoggerFactory.getLogger(MyRunner.class);

    private String col1 = "username";
    private String col2 = "password";

    @Override
    public void run(String... arg0)throws Exception{

        String sql = "SELECT id, username, password FROM users where id = :id";
        SqlParameterSource parameterSource = new MapSqlParameterSource()
               .addValue("id",1);


       User user = jdbcTemplate.queryForObject(sql,parameterSource,(rs,rowNum)->
               new User(rs.getString("username"),
                       rs.getString("password")));



    }
}
