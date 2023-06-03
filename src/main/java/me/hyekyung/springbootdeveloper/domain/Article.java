package me.hyekyung.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 엔티티로 지정
@Getter // 아티클의 필드에 대한 게터 메서드 생성
@NoArgsConstructor(access = AccessLevel.PROTECTED)  // 기본 생성자 생성, 접근 제어는 protected
public class Article {
    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키가 자동으로 1씩 증가한다
    @Column(name = "id", updatable = false) // 'id'라는 이름을 가진 칼럼과 매핑
    private Long id;

    // null 값이 들어갈 수 없다
    @Column(name = "title", nullable = false)   // 'title'이라는 이름을 가진 컬럼과 매핑
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder    // 생성자 위에 어노테이션을 작성하면 빌터 패턴으로 생성자 생성
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
    // 빌더 패턴이란?
    // 빌더패턴을 사용하면 객체를 유연하고 직관적으로 생성할 수 있는 디자인 패턴

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
