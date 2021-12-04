package inthehieanli;

public class PingpangPlayer extends Player implements SpeakEnglish{
	   public PingpangPlayer() {
     	  
       }
public PingpangPlayer (String name,int age) {
     	  super(name,age);
       }
public void study() {
System.out.println("乒乓球运动员");

}
public void eat() {
System.out.println("乒乓球运动员吃羊肉喝白米粥");
}
public void speak() {
System.out.println("乒乓球运动员 说英语");
}
}
