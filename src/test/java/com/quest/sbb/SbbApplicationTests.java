package com.quest.sbb;

import com.quest.sbb.Article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testJpa() {

	}

}
