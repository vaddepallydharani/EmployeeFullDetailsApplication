package com.employee.service;

import com.employee.model.albums.Albums;
import com.employee.model.comments.Comment;

import java.util.List;

public interface AlbumService {

    public List<Albums> getAllAlbums();

    public Albums get1Album(Integer id);

    public List<Comment> getAllCommentsByPostId(Integer postId);
}
