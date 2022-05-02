package task4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class test {
	public static ResultSet rs;
	public static SQLHelp help;
	public static void getResult(){
		System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品类别\t\t商品数量\t\t商品描述");
		try {
			while(rs.next()){
				System.out.print(rs.getInt(1)+"\t\t");
				System.out.print(rs.getString(2)+"\t\t");
				System.out.print(rs.getFloat(3)+"\t\t");
				System.out.print(rs.getString(4)+"\t\t");
				System.out.print(rs.getInt(5)+"\t\t");
				System.out.print(rs.getString(6)+"\t\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		help.dbclose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("菜单运行界面如下：");
		System.out.println("**************商品管理系统**************");
		System.out.println("1 添加商品");
		System.out.println("2 显示所有商品信息");
		System.out.println("3 根据类别查找商品");
		System.out.println("4 修改商品信息");
		System.out.println("5 根据商品编号删除商品");
		System.out.println("6 查询指定商品的总价");
		System.out.println("7 按商品价格排序");
		System.out.println("8 退出");
		System.out.println("****************************************");

		Scanner in = new Scanner(System.in);
		int choose = in.nextInt();
		String sql = "";
		help = new SQLHelp();
		switch (choose) {
			case 1:
				//1 添加商品
				System.out.println("请输入商品信息：");
				System.out.println("商品编号：");
				int newNo = in.nextInt();
				System.out.println("商品名称：");
				String newname = in.next();
				System.out.println("商品价格：");
				int nprice = in.nextInt();
				System.out.println("商品类别：");
				String ntype = in.next();
				System.out.println("商品数量：");
				int nnum = in.nextInt();
				System.out.println("商品备注：");
				String nemo = in.next();
				sql = "INSERT INTO t_goods VALUES("+newNo+",'"+newname+"',"+nprice+",'"+ntype+"',"+nnum+",'"+nemo+"')";
				help.getUpdate(sql);
				break;
			case 2:
				//2 显示所有商品信息
				sql="SELECT * from t_goods";
				rs = help.getQuery(sql);
				System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品类别\t\t商品数量\t\t商品描述");
				try {
					while(rs.next()){
						System.out.print(rs.getInt(1)+"\t\t");
						System.out.print(rs.getString(2)+"\t\t");
						System.out.print(rs.getInt(3)+"\t\t");
						System.out.print(rs.getString(4)+"\t\t");
						System.out.print(rs.getInt(5)+"\t\t");
						System.out.print(rs.getString(6)+"\t\t\n");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				//3 根据类别查找商品
				System.out.println("请输入商品类别：");
				String type = in.next();
				sql = "SELECT * FROM t_goods WHERE type='"+type+"'";
				break;
			case 4:
				//4 修改商品信息
				System.out.println("请输入要修改的商品信息：");
				System.out.println("要修改的商品编号：");
				int uNo = in.nextInt();
				System.out.println("修改的商品名称：");
				String uname = in.next();
				System.out.println("修改的商品价格：");
				int uprice = in.nextInt();
				System.out.println("修改的商品数量：");
				int unum = in.nextInt();
				sql = "UPDATE t_goods set goodname='"+uname+"',price="+uprice+",number="+unum+" where goodid="+uNo+"";
				help.getUpdate(sql);
				break;
			case 5:
				//5 根据商品编号删除商品
				System.out.println("请输入要删除的商品信息：");
				System.out.println("要删除的商品编号：");
				int dNo = in.nextInt();
				sql = "DELETE FROM t_goods where goodid="+dNo+"";
				help.getUpdate(sql);
				break;
			case 6:
				//6 查询指定商品的总价

				break;
			case 7:
				//7 按商品价格排序

				break;
			case 8:
				//8 退出
				System.exit(0);
				break;
			default:
				break;
		}
	}

}
