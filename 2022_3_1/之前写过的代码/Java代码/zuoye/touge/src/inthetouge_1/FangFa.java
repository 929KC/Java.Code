package inthetouge_1;

public class FangFa {

	public static void main(String[] args) {
		  int[] scores={79,52,98,81};
			/********** Begin **********/
	        //调用方法，传入成绩数组，并获取成绩的个数
	        int count= sort(scores);
			/********** End **********/
	        System.out.println("共有"+count+"个成绩信息！");
	    }

	    /*
	     * 功能：将考试成绩排序并输出，返回成绩的个数
	     * 
	     */
		/********** Begin **********/	
	    public static  int sort(int [] data ){
	       // 数组从小到大排序处理
           
	       // 打印出数组
	    	  for(int i=0; i<data.length; i++) {
	            	 System.out.println(data[i]);
	             }
	       //返回数组中元素的个数
             return  data.length;

	}

}
