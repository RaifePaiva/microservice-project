package br.com.hrmicro.hrworker.resources;

import br.com.hrmicro.hrworker.entities.Worker;
import br.com.hrmicro.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResource {


    private static Logger logger = LoggerFactory.getLogger(WorkerResource.class);

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private Environment env;


    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list =  workerRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        logger.info("PORT = " + env.getProperty("local.server.port"));
        Worker worker = workerRepository.findById(id).get();
        return ResponseEntity.ok().body(worker);
    }



}
