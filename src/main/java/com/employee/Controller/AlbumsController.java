package com.employee.Controller;

import com.employee.model.albums.Albums;
import com.employee.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    @Autowired
    AlbumService albumService;

    @GetMapping("/get-all")
    public List<Albums> getAllAlbums(){
        return albumService.getAllAlbums();
    }

    @GetMapping("/get-by-id")
    public Albums get1Album(@RequestParam Integer id){
        return albumService.get1Album(id);
    }
}
