package com.example.demo.information;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {

    public List<Information> getInformation() {
        return List.of(
                new Information(
                        12345,
                        21,
                        "moradi",
                        "aria",
                        "ariaman1381@gmail.com"
                )
        );
    }
}
