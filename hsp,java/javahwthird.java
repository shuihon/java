public class javahwthird {
	public static void main (String [] args) {
		System.out.println("java注释有单行注释和多行注释以及文档注释。"
				+ "\n\t单行注释：//注释文字"
				+ "\n\t多行注释：/*注释文字*/"
				+ "\n文档注释：\r\t其注释内容可以被java开发工具Javadoc所解析，"
				+ "\n\t生成一套以网页文件形式所呈现的，说明该程序的文档"
				+ "\n\t一般写在最前面，例如写在public class代码前面。"
				+ "\njavadoc -d:\\\\temp -author -version hello.java"
				+ "\n\t文件存放的位置，固定写法标签俩个，最后是对哪个文件执行该操作。");
	}
}