package Ru.Compass.controller;

import Ru.Compass.logic.CompModel;
import Ru.Compass.logic.Compas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {
    private static final CompModel compModel = CompModel.getInstance();
    private static final AtomicInteger newid = new AtomicInteger(1);
    private String text;

    @PostMapping(value = "/createCompas",consumes = "application/json",produces = "application/json")
    public String createCompas(@RequestBody Compas compas){
        compModel.add(compas,newid.getAndIncrement());
        return text = "Сторона задана";
    }

    @GetMapping(value = "/getAll",produces ="application/json")
    public Map<Integer, Compas> getAll(){return compModel.getAll();}

}
