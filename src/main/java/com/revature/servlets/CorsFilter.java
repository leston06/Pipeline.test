package com.revature.servlets;

public class CorsFilter implements filter{
    
    System.out.println("Incoming " + httpRequest.getMethod() + " request at " + httpRequest.getRequestURI());
    
    httpResponse.addHeader("Access-Control-Allow-Origin", "http://localhost:4200");
    httpResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, HEAD, OPTIONS");
    httpResponse.addHeader("Access-Control-Allow-Headers", "Content-Type");
    
    if (httpRequest.getMethod().equals("OPTIONS"))
        httpResponse.setStatus(202);
    
    // What filters on the request to the Servlet
    chain.doFilter(httpRequest, httpResponse);
}
