package org.boaboa.poc.sb15665.controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pperez
 * @since 14-01-2019
 */
@RestController
@RequestMapping("/hello")
public class VaultController {

  @GetMapping
  public void greetings() {
    throw new IllegalArgumentException("This is a demo");
  }

  @ExceptionHandler(IllegalArgumentException.class)
  public void illegalArgument(HttpServletResponse response) throws IOException {
    response.sendError(HttpStatus.BAD_REQUEST.value());
  }

}
