package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JdbcTest {

	private Connection con = null;// 创建一个数据库连接
	private PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
	private ResultSet result = null;// 创建一个结果集对象

	// 连接数据库
	public void init() {
		try {
			System.out.println("创建数据库连接...");
			Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
			String url = "jdbc:oracle:" + "thin:@127.0.0.1:1521:orcl";// 127.0.0.1是本机地址，ORCL 是Oracle的数据库名字
			Properties po = new Properties();
			po.put("user", "Serin");
			po.put("password", "3510503");
			con = DriverManager.getConnection(url, po);// 获取连接
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			System.out.println("数据连接失败！");
			e.printStackTrace();
		}
	}

	// 查询
	public void select() {
		try {
			String sql = "select * from test";// 预编译语句，“？”代表参数
			pre = con.prepareStatement(sql);// 实例化预编译语句
			result = pre.executeQuery();// 执行查询（select使用），注意括号中不需要再加参数
			while (result.next()) {
				// 当结果集不为空时
				System.out.print(result.getString("sn") + "\n");
			}
			// System.out.println(productsList);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	// 修改
	public void update() {
		try {
			String sql = "update test set SN = ? where NO = ?";
			pre = con.prepareStatement(sql);
			pre.setString(1, "SSSS");
			pre.setInt(2, 1);

			if (pre.executeUpdate() == 1) // update, delete, insert, 使用 executeUpdate()
				System.out.println("update successful!");
			else
				System.out.println("update fail!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

	}

	// 增加数据
	public void add() {
		try {
			String sql = "insert into  test values (?,?,?)";
			pre = con.prepareStatement(sql);
			pre.setInt(1, 5);
			pre.setString(2, "www");
			pre.setInt(3, 22);

			if (pre.executeUpdate() == 1) // update, delete, insert, 使用 executeUpdate()
				System.out.println("adddate successful!");
			else
				System.out.println("adddate fail!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	// 删除数据
	public void delete() {
		try {
			String sql = "delete from test where NO=?";
			;
			pre = con.prepareStatement(sql);
			pre.setInt(1, 5);

			if (pre.executeUpdate() == 1) // update, delete, insert, 使用 executeUpdate()
				System.out.println("delete successful!");
			else
				System.out.println("delete fail!");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	// 关闭数据库连接
	public void end() {
		// 不管如何，连接的对象必须释放
		try {
			// 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
			// 注意关闭的顺序，最后使用的最先关闭
			if (result != null)
				result.close();
			if (pre != null)
				pre.close();
			if (con != null)
				con.close();
			System.out.println("数据库连接已关闭！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JdbcTest a = new JdbcTest();
		a.init();
		// a.select();
		// a.update();
		a.delete();
		// a.add();
		a.end();

	}
}
