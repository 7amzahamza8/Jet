//package com.Super.jet.controller;
//
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.csrf.CsrfToken;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class SecurityController {
//    @GetMapping("/csrf")
//    public CsrfToken getCsrf(HttpServletRequest request) {
//       return (CsrfToken)request.getAttribute("_csrf");
//    }
//    @GetMapping("/session_id")
//    public String index(HttpServletRequest request) {
//        return request.getSession().getId();
//    }
//}
