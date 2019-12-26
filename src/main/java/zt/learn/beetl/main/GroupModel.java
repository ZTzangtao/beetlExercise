package zt.learn.beetl.main;

import lombok.SneakyThrows;
import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.FileResourceLoader;
import org.beetl.core.resource.StringTemplateResourceLoader;

/**
 * @author zangtao
 * @date 2019/12/26 11:02
 */
public class GroupModel {
    @SneakyThrows
    public static void main(String[] args) {
        //初始化代码
        StringTemplateResourceLoader resourceLoader = new StringTemplateResourceLoader();
//        FileResourceLoader fileResourceLoader =  new FileResourceLoader("");
        Configuration cfg = Configuration.defaultConfiguration();
        //这边是核心，需要两个参数，一个是模板资源加载器，一个是配置类
        GroupTemplate gt = new GroupTemplate(resourceLoader, cfg);
        //获取模板
        Template t = gt.getTemplate("hello,${name}");
        t.binding("name", "beetl");
        //渲染结果
        String str = t.render();
        System.out.println(str);
    }

}
