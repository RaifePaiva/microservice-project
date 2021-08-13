package br.com.hrmicro.hrworker.repositories;

import br.com.hrmicro.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {



}
