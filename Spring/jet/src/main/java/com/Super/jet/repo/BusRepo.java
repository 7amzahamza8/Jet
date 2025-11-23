package com.Super.jet.repo;

import com.Super.jet.model.BusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepo extends JpaRepository <BusModel,Integer> {}
