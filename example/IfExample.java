package example;

public class IfExample {
	public static void main(String[] args) {
		//���ں����� ����� ���ڰ��� ����ϼ���.
		//��, ����� ���ڰ��� ���ĺ� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		char mun='x';
		//A: 65, a: 97
		//�������� �ҹ����� ��� �빮�ڷ� ��ȯ
		if(mun>='a' && mun<='z') mun-=32;
		System.out.println("mun = "+mun);
		
		
		System.out.println("============================================");
		
		//���������� ����� �������� 4�� ������� �ƴ����� �����Ͽ� ����ϼ���.
		int num=345644;
		
		//�������� 4�� ����� ���
		if(num%4==0) {
			System.out.println("[���]"+num+" >> 4�� ����� �½��ϴ�.");
		}
		 else {
			System.out.println("[���]"+num+" >> 4�� ����� �ƴմϴ�.");
		}
			
		
		System.out.println("============================================");
		
		//���ذ� ������� ���������� �����Ͽ� ����ϼ���.
		// => �⵵�� 4�� ������ �������� 0�� ��� ����
		// => �� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
		// => �� ���ǵ��� �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
		int year=2019;
		
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.println("[���]"+year+"���� �����Դϴ�. ");
		} else {
			System.out.println("[���]"+year+"���� ����Դϴ�. ");
			
		}		

		
		System.out.println("============================================");
		
		//�̸��� "ȫ�浿"�� �л��� ���輺���� ���� 87��, ���� 93��, ���� 80���Դϴ�.
		//�л��� ���輺���� ���� ������ ���, ��տ� ���� ������ ����Ͽ� 
		//�̸�, ����, ���, ������ ����ϼ���.
		// => ����, ����, ���� ���� �� �ϳ��� 0~100 ������ �ƴ� ��� ���α׷� ���� : System.exit(0);
		// => ��տ� ���� ���� : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		// => ����� �Ҽ��� 2�ڸ������� ��µǵ��� �ϰ� �������� ����ó�� �ϼ���.
		String name="ȫ�浿";
		int kor=87,eng=93,mat=80;
		
		//�Է°��� ���� ��ȿ�� �˻� >> Validation
		/*
		if(kor<0 || kor>100 || eng<0 || eng>100 || mat<0 || mat>100) {
			System.out.println("[����]0~100 ������ ��� ������ �ԷµǾ����ϴ�.");
			System.exit(0); // ���α׷� ���� ���� �޼ҵ�
		}
		*/
		//������ �Է� ��ȿ�� �˻� ���� ���������� �����ϱ� ���� ����
		boolean status=false;
		
		if(kor<0 || kor>100) {
			System.out.println("[����]0~100 ������ ��� ���������� �ԷµǾ����ϴ�.");
			status=true;
		}
		
		if(eng<0 || eng>100) {
			System.out.println("[����]0~100 ������ ��� ���������� �ԷµǾ����ϴ�.");
			status=true;
		}
		
		if(mat<0 || mat>100) {
			System.out.println("[����]0~100 ������ ��� ���������� �ԷµǾ����ϴ�.");
			status=true;
		}
		
		//if ������ ���ǽ� ��� boolean ���� ��� ����
		if(status) {
			System.exit(0);
		}
		
		int tot=kor+eng+mat;
		double avg=tot/3.0;
		String grade="";
		
		switch((int)avg/10) {
		case 10: 		
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";	
		}
		
		System.out.println("�̸� = "+name+", ���� = "+tot+", ��� = "+(int)(avg*100)/100.+", ���� = "+grade);
		
		
		
		
		/*
		int kor=87,eng=93,mat=80;
						
		if(kor>=0 && kor<=100 && eng>=0 && eng<=100 && mat>=0 && mat<=100) {
		
		String name="ȫ�浿";
		int tot=kor+eng+mat;
		double avg=tot/3.;
		
		char grade;
		if(avg>=90) grade='A';
		else if(avg>=80) grade='B';
		else if(avg>=70) grade='C';
		else if(avg>=60) grade='D';
		else grade='F';
		
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+tot);
		//System.out.println("��� = "+avg);
		//System.out.println("��� = "+(int)(avg*100)/100.);
		
		System.out.println("��� = "+(int)(avg*100)/100.+" >> "+grade+"���� �Դϴ�." );
		} else {
			System.out.println("[����]0~100 ������ ��� ������ �ԷµǾ����ϴ�.");
			System.exit(0);
				
		}
		*/
		
		System.out.println("============================================");
	}
}






