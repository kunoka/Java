package three.four;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到新学期", "管理员", new Date());
        Notice notice2 = new Notice(2, "老师来了，请就坐", "老师", new Date());
        Notice notice3 = new Notice(3, "准备上课", "老师", new Date());

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
    }
}
