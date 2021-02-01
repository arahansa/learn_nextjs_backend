package com.arahansa.learn_next_js.controller

import com.arahansa.learn_next_js.dto.BookRes
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BooksController {

    @GetMapping("/books")
    fun books() : List<BookRes>{
        println("북스 요청..?")
        var list = mutableListOf<BookRes>()
        for(i in 1..20){
            list.add(BookRes(i.toLong(), "책$i"))
        }
        return list
    }
}
