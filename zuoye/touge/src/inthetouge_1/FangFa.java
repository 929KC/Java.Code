package inthetouge_1;

public class FangFa {

	public static void main(String[] args) {
		  int[] scores={79,52,98,81};
			/********** Begin **********/
	        //���÷���������ɼ����飬����ȡ�ɼ��ĸ���
	        int count= sort(scores);
			/********** End **********/
	        System.out.println("����"+count+"���ɼ���Ϣ��");
	    }

	    /*
	     * ���ܣ������Գɼ�������������سɼ��ĸ���
	     * 
	     */
		/********** Begin **********/	
	    public static  int sort(int [] data ){
	       // �����С����������
           
	       // ��ӡ������
	    	  for(int i=0; i<data.length; i++) {
	            	 System.out.println(data[i]);
	             }
	       //����������Ԫ�صĸ���
             return  data.length;

	}

}
