package me.hyekyung.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.hyekyung.springbootdeveloper.domain.Article;

@NoArgsConstructor  // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter             // getter 자동 생성
public class AddArticleRequest {
    // 컨트롤러에서 요청 본문을 받을 객체
    private String title;   // 오늘의 일기
    private String content; // 내용

    public Article toEntity() { // 빌더 패턴을 사용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }// 빌더 패턴을 이용해 DTO를 엔티티로 만들어주는 메서드
}
