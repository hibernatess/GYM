package com.gym.ssm.base;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *用来获取request等数据
 */
public class BaseAction  {

	private static final long serialVersionUID = -7110462505161900879L;

	/**
	 * 为了传值使用
	 */
	protected HttpServletResponse response;
	protected HttpServletRequest request;
	protected HttpSession session;
	protected ServletContext application;

	/**
	 *ajax使用
	 * @param str
	 * @throws IOException
	 */
	public void print(String str) throws IOException {
		PrintWriter writer = this.response.getWriter();
		writer.print(str);
		writer.flush();
		writer.close();
	}

	public void setServletResponse(HttpServletResponse arg0) {
		this.response = arg0;

	}

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;
		this.session = arg0.getSession();
		this.application = arg0.getServletContext();
	}


}
