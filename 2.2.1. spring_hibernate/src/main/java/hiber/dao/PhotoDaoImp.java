package hiber.dao;

import hiber.model.Photo;
import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class PhotoDaoImp implements PhotoDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Photo photo) {
        sessionFactory.getCurrentSession().save(photo);
    }

    @Override
    public void save(Photo photo) {

    }

    @Override
    public List<Photo> listPhoto() {
        TypedQuery<Photo> query=sessionFactory.getCurrentSession().createQuery("from Photo");
        return query.getResultList();
    }

    @Override
    public User getUserByPhotoId(long id) {
        return null;
    }
}
