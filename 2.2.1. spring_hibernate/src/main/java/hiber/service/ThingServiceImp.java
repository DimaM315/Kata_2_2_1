package hiber.service;

import hiber.dao.PhotoDao;
import hiber.dao.UserDao;
import hiber.model.Photo;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ThingServiceImp implements ThingService {
    @Autowired
    private PhotoDao photoDao;

    @Transactional
    @Override
    public void addPhoto(Photo photo) {
        photoDao.add(photo);
    }

    @Transactional
    @Override
    public void savePhoto(Photo photo) {
        photoDao.add(photo);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Photo> listPhoto() {
        return photoDao.listPhoto();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserByPhotoId(long id) {
        return null;
    }
}
