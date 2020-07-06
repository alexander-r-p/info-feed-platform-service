package net.infofeedplatform.infofeedplatform.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("Articles REST Endpoint")
@RestController
@RequestMapping("/api/articles")
public class ArticleResource {

    private static final Logger logger = LoggerFactory.getLogger(ArticleResource.class);

    @ApiOperation("Create Article instance")
    @PostMapping
    public ResponseEntity createArticle() {
        logger.info("[CREATE] Article: {}.");
        return ResponseEntity.ok().build();
    }

    @ApiOperation("Get Article instance by id")
    @GetMapping()
    public ResponseEntity getAll() {
        logger.info("[GET] Articles: {}.");
        return ResponseEntity.ok().build();
    }

    @ApiOperation("Get Article instance by id")
    @GetMapping("/{id}")
    public ResponseEntity getArticle(@PathVariable String id) {
        logger.info("[GET] Article: {}.");
        return ResponseEntity.ok().build();
    }

    @ApiOperation("Delete Article instance by id")
    @DeleteMapping("/{id}")
    public ResponseEntity deleteArticle(@PathVariable String id) {
        logger.info("[DELETE] Article: {}.");
        return ResponseEntity.ok().build();
    }
}
