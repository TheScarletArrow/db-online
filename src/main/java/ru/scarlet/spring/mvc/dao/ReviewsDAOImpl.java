package ru.scarlet.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.scarlet.spring.mvc.dao.ReviewsDAO;
import ru.scarlet.spring.mvc.entity.Reviews;

import java.util.List;
@Repository
public class ReviewsDAOImpl implements ReviewsDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Reviews> getAllReviews(){
        Session session= sessionFactory.getCurrentSession();
        List<Reviews> allReviews = session.createQuery("from Reviews ", Reviews.class)
                .getResultList();

        return allReviews;
    }

    @Override
    public void saveReview(Reviews reviews) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(reviews);
    }
}
