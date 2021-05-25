package com.br.fap.quiz.service

import com.br.fap.quiz.model.Quiz
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class QuizService {

    fun getAllQuizzes(): Flux<Quiz> {
        return Flux.fromIterable(listOf(
            Quiz("Kotlin Quiz", "Quiz about Kotlin"),
            Quiz("Scala Quiz", "Quiz about Scala"),
            Quiz("Java Quiz", "Quiz about Java")
        ))
    }
}