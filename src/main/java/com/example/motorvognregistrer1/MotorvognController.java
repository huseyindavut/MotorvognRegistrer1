package com.example.motorvognregistrer1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class MotorvognController {
    public final ArrayList<Motorvogn> alleMotorvognRegistrer=new ArrayList<>();
    @PostMapping("/add")
    public void add(Motorvogn motorvogn){
        alleMotorvognRegistrer.add(motorvogn);
    }
    @GetMapping("/hentalle")
    public ArrayList<Motorvogn> hentAlleMotorvogn(){
        return alleMotorvognRegistrer;
    }
    @GetMapping("/slett")
    public void slettAlleMotorvogn(){
        alleMotorvognRegistrer.clear();
    }
}
