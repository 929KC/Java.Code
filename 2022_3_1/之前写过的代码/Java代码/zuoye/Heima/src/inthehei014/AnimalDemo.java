package inthehei014;

public class AnimalDemo {
/*
 * ����ת��
 * ���ӵ���
 * ��������ָ���������
 * ����ת��
 * �Ӹ�����
 * ��������תΪ�������
 */
	public static void main(String[] args) {
		//��̬
		Animal a=new Cat();
		a.eat();
		//a.playGame();
		/*Cat c=new Cat();
		c.eat();
		c.playGame();*/
		Cat c=(Cat)a;
		c.eat();
		c.playGame();
	}
}
