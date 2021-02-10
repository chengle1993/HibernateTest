package com.sumscope.hibernate.test;

import com.scau.beyondboy.domain.News;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate测试小例子，参照 https://blog.csdn.net/xuguoli_beyondboy/article/details/42090665
 * 以xml文件的方式来映射
 */
public class App 
{
    public static void main( String[] args )
    {
        //实例化Configuration，这行代码默认加载hibernate.cfg.xml文件
        Configuration conf = new Configuration().configure();
        //以Configuration创建SessionFactory
        SessionFactory sf = conf.buildSessionFactory();
        //实例化Session
        Session sess = sf.openSession();
        //开始事务
        Transaction tx = sess.beginTransaction();
        //创建消息实例
        News n = new News();
        //设置消息标题和消息内容
        n.setTitle("scau");
        n.setContent("beyondboy");
        //保存消息
        sess.save(n);
		News n2 = (News) sess.get(News.class, 1);
		//输出fullContent属性值
		System.out.println(n2.getFullContent());
        //提交事务
        tx.commit();
        //关闭Session
        sess.close();
    }
}
