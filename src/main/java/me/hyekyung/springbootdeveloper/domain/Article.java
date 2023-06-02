package me.hyekyung.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder    // 빌터 패턴으로 객체 생성
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }
    // 빌더 패턴이란?
    // 빌더패턴을 사용하면 객체를 유연하고 직관적으로 생성할 수 있는 디자인 패턴

    protected Article(){}   // 기본 생성자

    // 게터

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
