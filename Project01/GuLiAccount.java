class GuLiAccount
{
	public static void main(String[] args){
		//����ѭ������
		boolean isFlag = true;
		//��ʼ���
		int balance = 10000;
		String info ="";
	
		while(isFlag){
			System.out.println("-----------------�����������-----------------\n");
			System.out.println("                   1 ��֧��ϸ");
			System.out.println("                   2 �Ǽ�����");
			System.out.println("                   3 �Ǽ�֧��");
			System.out.println("                   4 ��    ��\n");
			System.out.print("                   ��ѡ��(1-4)��");
			
			char selection = Utility.readMenuSelection();

			switch(selection){
				case '1':
					System.out.println("-----------------��ǰ��֧��ϸ��¼-----------------");
					System.out.println("��֧\t�˻����\t��֧���\t˵    ��");
					System.out.println(info);
					System.out.println("--------------------------------------------------");
					
					break;
				case '2':
					System.out.print("���������");
					int money1 = Utility.readNumber();

					if(money1 > 0){
						balance += money1;
					}

					System.out.print("��������˵����");
					String addDesc1 = Utility.readString();
					
					info += "����\t" + balance + "\t\t" + money1 + "\t\t" + addDesc1 + "\n";

					break;
				case '3':
					System.out.print("����֧����");
					int money2 = Utility.readNumber();

					if(money2 > 0 && balance >= money2){
						balance -= money2;
					}

					System.out.print("����֧��˵����");
					String addDesc2 = Utility.readString();
					
					info += "֧��\t" + balance + "\t\t" + money2 + "\t\t" + addDesc2 + "\n";

					break;
				case '4':
					System.out.print("ȷ���Ƿ��˳�(Y/N)��");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y') isFlag = false;				
					break;
			}
		}
	}
}