package ru.scarlet.spring.mvc.dao;

import ru.scarlet.spring.mvc.entity.Reviews;

import java.util.List;

public interface ReviewsDAO {
    public List<Reviews> getAllReviews();
}
