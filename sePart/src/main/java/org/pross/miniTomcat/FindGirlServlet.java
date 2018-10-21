package org.pross.miniTomcat;

import java.io.IOException;

/**
 * @describe:
 * @author:彭爽pross
 * @date: 2018/10/20
 */
public class FindGirlServlet extends MyServlet {

	public void doGet(MyRequest myRequest, MyResponse myResponse) {
		try {
			myResponse.write("get girl ...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void doPost(MyRequest myRequest, MyResponse myResponse) {
		try {
			myResponse.write("post girl ...");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}