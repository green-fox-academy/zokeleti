package connetctionwithmysql.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import connetctionwithmysql.exercise.model.Todo;
import connetctionwithmysql.exercise.repository.Repository;

@SpringBootApplication
public class ExerciseApplication implements CommandLineRunner {

    Repository todoRepository;

    @Autowired
    public ExerciseApplication(Repository repository){
        this.todoRepository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
