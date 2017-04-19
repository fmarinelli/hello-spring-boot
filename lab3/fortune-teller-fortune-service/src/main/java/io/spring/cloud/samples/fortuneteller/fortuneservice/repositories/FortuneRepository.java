package io.spring.cloud.samples.fortuneteller.fortuneservice.repositories;

import io.spring.cloud.samples.fortuneteller.fortuneservice.domain.Fortune;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FortuneRepository extends PagingAndSortingRepository<Fortune, Long> {

    @Query("select fortune from Fortune fortune order by RAND()")
    List<Fortune> randomFortunes(Pageable pageable);
}