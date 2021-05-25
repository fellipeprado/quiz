package com.br.fap.quiz.controller

import com.br.fap.quiz.model.Quiz
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import com.br.fap.quiz.service.QuizService

@RestController
class QuizController (private val quizService: QuizService) {
    
    @GetMapping("/quizzes")
    fun getQuizzes(): Flux<Quiz>{
        return quizService.getAllQuizzes()
    }

}