package com.gm.conceptualmodel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gm.conceptualmodel.domain.ItemRequest;

@Repository
public interface ItemRequestRepository extends JpaRepository<ItemRequest, Integer> {

}