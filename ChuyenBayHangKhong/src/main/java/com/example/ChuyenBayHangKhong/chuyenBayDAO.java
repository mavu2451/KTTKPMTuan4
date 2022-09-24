package com.example.ChuyenBayHangKhong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class chuyenBayDAO {
    @Autowired
    private ChuyenBayRepository repository;
    public void getGaDen(){
        List<chuyenBay> cb = repository.getGaDen("DAD");
        System.out.println(cb);
    }
    public void getAll(){
        List<chuyenBay> cb = (List<chuyenBay>) repository.findAll();
        System.out.println(cb);
    }
    @Bean
    public CommandLineRunner run(){
        return (args -> {
            getGaDen();
            System.out.println(repository.findAll());
        });
    }
}
