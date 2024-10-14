package br.com.guilherme.screenmatch;

import br.com.guilherme.screenmatch.principal.Principal;
import br.com.guilherme.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class ScreenmatchApplicationSemWeb implements CommandLineRunner {
//    @Autowired
//    private SerieRepository repository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(ScreenmatchApplicationSemWeb.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Principal principal = new Principal(repository);
//        principal.exibeMenu();
//    }
//}
