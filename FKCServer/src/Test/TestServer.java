package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * ��ɱ���ֲ���������Server returned HTTP response code: 403 for URL: https://translate.google.cn��ϵͳ
 * 
 * 
 * 
 * */
public class TestServer extends Thread{
	private ServerSocket ss;
	
	//������֤��
	private int VerificationCode(String youEmial){
		TestMail emial = null;
		try {
			emial = new TestMail(youEmial);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emial.Verificationcode;
	}
	
	private Socket socket = null;
	public TestServer(){
		while(true){
			try {
				ss = new ServerSocket(8989);
				System.out.println("�����ɹ����ȴ��ͻ�������");
				socket = ss.accept();
				System.out.println("�ͻ������ӳɹ��������رշ�����");
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String vc = br.readLine();
				System.out.println(vc);
				int toAndroidVc;
				toAndroidVc = VerificationCode(vc);
				System.out.println(vc+":"+toAndroidVc);
				br.close();
				socket.close();
				socket = null;
				socket = ss.accept();
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.print(toAndroidVc);
				pw.flush();
				pw.close();
				socket.close();
				ss.close();
				System.out.println("socket�رճɹ�");	
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new TestServer();
	}

}
