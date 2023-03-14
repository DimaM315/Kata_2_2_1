package hiber.dao;

import hiber.model.Car;
import hiber.model.Photo;
import hiber.model.User;

import java.util.List;

public interface PhotoDao {
    void add(Photo photo);
    void save(Photo photo);
    List<Photo> listPhoto();
    User getUserByPhotoId(long id);
}
