package com.Super.jet.repo;

import com.Super.jet.model.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<CountryModel,Integer> {
}
