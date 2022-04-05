package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String sql="insert into genre (GenreID, GenreType) values (?, ?)";
        int result=jdbcTemplate.update(sql,"G06","Romance");

        if(result > 0)
            System.out.println("Inserare cu succes");
    }
}
