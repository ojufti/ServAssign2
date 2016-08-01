package com.bitwise.cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.swing.JOptionPane;

/**
 * Servlet Filter implementation class CartFilter
 */
@WebFilter("/CartFilter")
public class CartFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CartFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		String itemType=request.getParameter("itemType");
		String quant=request.getParameter("quant");
		if(quant==null)
		{
			PrintWriter out=response.getWriter();
			out.println("complete the field");
			request.getRequestDispatcher("Cart.html").include(request, response);
		}
		else{
		chain.doFilter(request, response);
	}}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
