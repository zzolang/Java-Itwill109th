package site.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//Ű����� �޼����� �Է¹޾� ���� ����ڿ��� �����ϴ� UDP ���α׷�
public class MessageSendApp {
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �޼��� �Է� >> ");
		String message=in.readLine();
		
		//DatagramSocket �ν��Ͻ� ����
		DatagramSocket socket=new DatagramSocket();
		
		//String.getBytes() : String �ν��Ͻ��� ���ڿ��� byte[] �迭�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		byte[] data=message.getBytes();
		
		InetAddress address=InetAddress.getByName("192.168.14.18");
		
		//DatagramPacket Ŭ���� : ���ϴ� ��ǻ�Ϳ��� ���� �����ϱ� ���� ������ �����ϱ� ���� Ŭ����
		//DatagramPacket(byte[], int length, InetAddress serverName, int port) ������
		DatagramPacket packet=new DatagramPacket(data, data.length, address, 5000);
		
		//DatagramSocket.send(DatagramPacket packet) : ��Ŷ�� ����� ������ �̿��Ͽ� �ٸ� ��ǻ�Ϳ��� �����ϴ� �޼ҵ�
		socket.send(packet);
		
		//DatagramSocket.close() : ������ �����ϴ� �޼ҵ�
		socket.close();
		
		System.out.println("[���]�޼����� ���� �Ͽ����ϴ�.");
		
		

				
	}
}












