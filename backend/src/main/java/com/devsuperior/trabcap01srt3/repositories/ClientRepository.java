package com.devsuperior.trabcap01srt3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.trabcap01srt3.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
