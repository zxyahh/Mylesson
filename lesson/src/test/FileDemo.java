package test;

import java.io.File;

class FileDemo {
	public static void main(String[] args) {
		File file = new File("test.txt");
		if (file.exists()) {// 判断是否存在
			System.out.println("文件 " + file.toString() + " 存在");
		} else {
			System.out.println("文件:" + file.toString() + " 不存在");
		}
		if (file.isFile()) { // 判断是否是文件
			System.out.println(file.toString() + " 是文件");
		} else {
			System.out.println(file.toString() + " 不是文件");
		}
		System.out.println("文件名：" + file.getName());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件大小(单位字节)：" + file.length());

		File[] roots = File.listRoots();// 根目录下的文件
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
			System.out.println();
		}
	}
}
