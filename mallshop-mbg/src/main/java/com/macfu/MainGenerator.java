package com.macfu;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author macfu
 * @description: 用于生成MBG代码
 * @date 2019/5/15
 */
public class MainGenerator {
    public static void main(String[] args) throws Exception {
        // 执行过程中的警告
        List<String> warnings = new ArrayList<>();
        // 当生成的代码重复时，覆盖原代码
        boolean overWrite = true;
        // 读取配置文件
        InputStream is = MainGenerator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback = new DefaultShellCallback(overWrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        myBatisGenerator.generate(null);

        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}
