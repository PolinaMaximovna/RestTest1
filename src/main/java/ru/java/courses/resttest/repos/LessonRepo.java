package ru.java.courses.resttest.repos;

import org.springframework.data.repository.CrudRepository;
import ru.java.courses.resttest.domain.Lessons;

public interface LessonRepo extends CrudRepository<Lessons, Long> {
}
