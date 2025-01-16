package com.mysite.sbb;

import java.time.LocalDateTime;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		Question q1 = new Question();
		q1.setSubject("sbb가 무엇인가요?");
		q1.setContent("sbb에 대해서 알고 싶습니다.");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("이거 큰일입니다.");
		q2.setContent("논문 공부 시간과 강의 공부 시간이 말도 안되게 오래 걸려요");
		q2.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q2);
	}

}
