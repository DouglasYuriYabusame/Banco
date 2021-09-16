package com.teste1.mark1.banco.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.teste1.mark1.banco.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {



}