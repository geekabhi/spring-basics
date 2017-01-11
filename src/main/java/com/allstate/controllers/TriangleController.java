package com.allstate.controllers;

import com.allstate.models.Triangle;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by localadmin on 11/01/17.
 */
@RestController
public class TriangleController {
    @RequestMapping(value = "/triangle/area", method = RequestMethod.POST)
    public Triangle area(@RequestBody Triangle triangle){
        return triangle;
    }

    @RequestMapping(value = "/triangle/areas", method = RequestMethod.POST)
    public double areas(@RequestBody List<Triangle> triangles){
        return Triangle.area(triangles);
    }
}
