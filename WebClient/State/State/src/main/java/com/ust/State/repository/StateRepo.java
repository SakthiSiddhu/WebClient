package com.ust.State.repository;

import com.ust.State.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StateRepo extends JpaRepository<State,Long> {
    Optional<State> findByStatecode(String code);
}
