package com.baofoo.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baofoo.util.GepUtils;
import com.baofoo.util.NotifyDecryptUtil;

/**
 * Servlet implementation class NotifyServlet 异步通知处理 注： ①、异步通知需要返回OK
 * ②、异步通知间隔依次递增，最大通知10次，如返回OK则不继续通知 ③、通知间隔(分钟)：0、1、3、6、10、15、21、28、36、45
 */
@WebServlet("/Notify/*")
public class NotifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NotifyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		GepUtils.log("--------------------------------接收到异步回调，开始处理----------------------------------");

		Enumeration<?> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String paraName = (String) enu.nextElement();
			GepUtils.log("接收通知参数：" + paraName + ": " + request.getParameter(paraName));
		}
		String dataContent = request.getParameter("dataContent");
		if (dataContent != null) {
			dataContent = NotifyDecryptUtil.decrypt(dataContent);
			GepUtils.log("密文 dataContent 解密后：" + dataContent);
			// TODO 业务处理
		}

		GepUtils.log("--------------------------------接收到异步回调，处理结束----------------------------------");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		pw.write("OK");// 收到通知需返回OK
	}

}
