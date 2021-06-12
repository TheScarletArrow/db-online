package ru.scarlet.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.scarlet.spring.mvc.dao.SpeedTestDAO;
import ru.scarlet.spring.mvc.entity.SpeedTest;

import java.util.List;
import java.util.Queue;
@Repository
public class SpeedTestDAOImpl implements SpeedTestDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<SpeedTest> getAllSpeedTests() {
        Session session = sessionFactory.getCurrentSession();
        List<SpeedTest> allSpeedTests = session.createQuery("from SpeedTest ", SpeedTest.class)
                .getResultList();

        return allSpeedTests;
    }

    @Override
    public void saveSpeedTest(SpeedTest speedTest) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(speedTest);
    }

    @Override
    public SpeedTest getSpeedTest(int id) {
        Session session = sessionFactory.getCurrentSession();

        SpeedTest speedTest = session.get(SpeedTest.class, id);

        return speedTest;
    }

    @Override
    public void deleteSpeedTest(int id) {
        Session session = sessionFactory.getCurrentSession();

        Query<SpeedTest> query = session.createQuery("delete from SpeedTest " +
                                "where id = :testId");
        query.setParameter("testId", id);
        query.executeUpdate();
    }
}
