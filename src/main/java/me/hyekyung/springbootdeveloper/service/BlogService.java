package me.hyekyung.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.hyekyung.springbootdeveloper.domain.Article;
import me.hyekyung.springbootdeveloper.dto.AddArticleRequest;
import me.hyekyung.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor    // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service    // 빈으로 등록
public class BlogService {
    // @Autowired 를 이용해도 됨
    private final BlogRepository blogRepository;

    /*
    1. 클라이언트에서 글 생성 요청을 보낸다
    2. AddArticleRequest라는 dto에 매핑이 된다
    3. AddArticleRequest가 Article 엔티티로 변환이 도니다.
    4. BlogRepository로 데이터 베이스에 저장
    5. 응답 요청
    */


    // 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
