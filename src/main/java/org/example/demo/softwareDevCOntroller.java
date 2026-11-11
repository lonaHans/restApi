package org.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-devs")
public class softwareDevCOntroller {

    @GetMapping
    public List<softwareDevs> getDevs(){
        return List.of(
                    new softwareDevs(1,
                            "Lona",
                            "lona@gmail.com",
                            List.of("Java","JS")
                    ),
                    new softwareDevs(
                            2,
                            "Cebisa",
                            "cebisa@gmail.com",
                            List.of("Java","Springboot")
                    )
        );


    }

}
