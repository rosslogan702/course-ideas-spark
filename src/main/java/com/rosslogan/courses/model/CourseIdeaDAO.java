package com.rosslogan.courses.model;

import java.util.List;

/**
 * Created by Ross on 06/11/2017.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

    CourseIdea findBySlug(String slug);
}
