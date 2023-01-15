package ro.mycode.managemusicportal.service;

import org.springframework.stereotype.Service;
import ro.mycode.managemusicportal.model.Singer;
import ro.mycode.managemusicportal.repository.SingerRepository;

import java.util.List;

@Service
public class SingerService {
    private SingerRepository singerRepository;

    public SingerService(SingerRepository singerRepository){
        this.singerRepository=singerRepository;
    }

    public List<Singer> getAllSingers(){
        return singerRepository.findAll();
    }
}
