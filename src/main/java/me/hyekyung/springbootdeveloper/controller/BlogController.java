package me.hyekyung.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.hyekyung.springbootdeveloper.domain.Article;
import me.hyekyung.springbootdeveloper.dto.AddArticleRequest;
import me.hyekyung.springbootdeveloper.dto.ArticleResponese;
import me.hyekyung.springbootdeveloper.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController // HTTP 응답 본문에 객체 데이터를 JSON 형식으로 변환하는 컨트롤러
//@Controller 응답값에 해당하는 뷰를 매핑하는 컨트롤러
public class BlogController {
    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)    // 201의 응답코드를 가지고
                .body(savedArticle);    // 저장된 아티클의 정보
    }

    @GetMapping("/api/articles")
    public ResponseEntity<List<ArticleResponese>> findAllArticles() {
        List<ArticleResponese> articles = blogService.findAll()
                .stream()
                .map(ArticleResponese::new)
                .toList();
        return ResponseEntity.ok().body(articles);
    }
}
