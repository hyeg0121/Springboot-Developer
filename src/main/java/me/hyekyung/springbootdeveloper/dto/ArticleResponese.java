package me.hyekyung.springbootdeveloper.dto;

import lombok.Getter;
import me.hyekyung.springbootdeveloper.domain.Article;

// 응답을 위한 dto
@Getter
public class ArticleResponese {

    private final String title;
    private final String content;

    public ArticleResponese(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
