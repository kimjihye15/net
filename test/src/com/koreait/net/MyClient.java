package com.koreait.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/*
 * 최초작성자 : 김지혜
 * 최초작성일 : 2021-02-25
 * 최종변경일 : 2021-02-25
 * 목적 : 네트워크구현테스트
 */

public class MyClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress("127.0.0.1", 5000));
			System.out.println("MyServer에 접속되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
