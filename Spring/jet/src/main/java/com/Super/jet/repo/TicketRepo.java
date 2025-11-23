package com.Super.jet.repo;

import com.Super.jet.model.CountryModel;
import com.Super.jet.model.RouteModel;
import com.Super.jet.model.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo  extends JpaRepository<TicketModel,Integer> {
}
