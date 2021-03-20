package ru.scarlet.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.scarlet.spring.mvc.entity.Location;

import java.util.List;

@Repository
public class LocationDAOImpl implements LocationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Location> getAllLocations() {
        Session session = sessionFactory.getCurrentSession();
        List<Location> allLocations = session.createQuery("from Location "
                , Location.class)
                .getResultList();


        return allLocations;
    }
}
