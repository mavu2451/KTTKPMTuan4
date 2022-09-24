package com.example.ChuyenBayHangKhong;

import com.example.ChuyenBayHangKhong.chuyenBay;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChuyenBayRepository extends CrudRepository<chuyenBay, Long> {
    @Query(value = "SElECT * FROM chuyenbay where gaden = ?1",nativeQuery = true)
    public List<chuyenBay> getGaDen(String GaDen);
}
