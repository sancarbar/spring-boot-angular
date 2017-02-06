package com.eci.cosw.controller;

import com.eci.cosw.model.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Santiago Carrillo
 *         1/31/17.
 */
@RestController
public class TodoController {


    @RequestMapping("/todo")
    public Todo todo() {
        return new Todo("homework COSW", "read about entrepreneurship", 10);
    }

}
