package hiber.service;

import hiber.model.Photo;
import hiber.model.User;

import java.util.List;

public interface ThingService {
    void addPhoto(Photo photo);
    void savePhoto(Photo photo);
    List<Photo> listPhoto();
    User getUserByPhotoId(long id);
}
