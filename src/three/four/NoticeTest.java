package three.four;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到慕课网！", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学们按时交作业！", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        //打印公告内容
        System.out.println("公告内容: ");
        for (int i = 0; i < noticeList.size(); i++) {
            String title = i + 1 + ": " + ((Notice) (noticeList.get(i))).getTitle();
            System.out.println(title);
        }
        //在第1条公告后面添加一条公告
        Notice notice4 = new Notice(4, "在线编辑器可以使用啦！", "管理员", new Date());
        noticeList.add(1, notice4);
        System.out.println("********************");
        //打印公告内容
        System.out.println("公告内容: ");
        for (int i = 0; i < noticeList.size(); i++) {
            String title = i + 1 + ": " + ((Notice) (noticeList.get(i))).getTitle();
            System.out.println(title);
        }
        //删除按时提交作业的公告
        noticeList.remove(2);
        System.out.println("********************");
        //打印公告内容
        System.out.println("删除牢里交作业后的公告内容: ");
        for (int i = 0; i < noticeList.size(); i++) {
            String title = i + 1 + ": " + ((Notice) (noticeList.get(i))).getTitle();
            System.out.println(title);
        }
        //将第二条公告改为: Java在线编辑器可以使用啦
        notice4.setTitle("Java" + notice4.getTitle());
        noticeList.set(1, notice4); //这一行可以不用，引用传递，上一句已经修改
        //打印公告内容
        System.out.println("********************");
        System.out.println("修改在线编辑器后的公告内容: ");
        for (int i = 0; i < noticeList.size(); i++) {
            String title = i + 1 + ": " + ((Notice) (noticeList.get(i))).getTitle();
            System.out.println(title);
        }
    }
}
