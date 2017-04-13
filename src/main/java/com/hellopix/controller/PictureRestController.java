package com.hellopix.controller;

import com.hellopix.model.Picture;
import com.hellopix.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
public class PictureRestController {

    @Autowired
    private PictureRepository pictureRepository;

    @RequestMapping(value = "/picture", method = RequestMethod.PUT, produces = "application/json")
    public void addPictures() {
        pictureRepository.save(Arrays.asList(new Picture("MariannGéza20170512_0001.jpg")));
    }

    @RequestMapping(value = "/picture", method = RequestMethod.DELETE, produces = "application/json")
    public void deletePictures() {
        pictureRepository.deleteAll();
    }

    @RequestMapping(value = "/picture", method = RequestMethod.GET, produces = "application/json")
    public List<Picture> getPictures() {
        return StreamSupport.stream(pictureRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

}
