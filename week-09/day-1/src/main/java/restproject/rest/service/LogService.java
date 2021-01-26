package restproject.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restproject.rest.model.Log;
import restproject.rest.repository.LogRepository;

import java.sql.Timestamp;
import java.util.List;


@Service
public class LogService {


    LogRepository repo;

    @Autowired
    public LogService(LogRepository repo){
        this.repo = repo;
    }

    public void saveLog(String endpoint, String data){
        Log logToSave = new Log(new Timestamp(System.currentTimeMillis()), data, endpoint);
        repo.save(logToSave);
    }

    public List<Log> listAll(){
        return (List<Log>) repo.findAll();
    }


}
