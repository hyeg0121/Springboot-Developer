package me.hyekyung.springbootdeveloper.repository;

import me.hyekyung.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
