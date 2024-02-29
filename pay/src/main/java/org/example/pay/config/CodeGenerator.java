package org.example.pay.config;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class CodeGenerator {

    private static String url = "jdbc:mysql:///cloud?characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai";
    private static String userName = "root";
    private static String password = "";

    public static void main(String[] args) {

        FastAutoGenerator.create(url, userName, password)
                .globalConfig(builder -> {
                    builder.author("xxb") // 设置作者
                            .enableSpringdoc() // 开启 swagger 模式
                            .outputDir("D:\\project\\personal\\cloud2024\\pay\\src\\main\\java"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    if (typeCode == Types.TIMESTAMP){
                        return DbColumnType.DATE;
                    }
                    return typeRegistry.getColumnType(metaInfo);
                }))
                .packageConfig(builder -> {
                    builder.parent("org.example.pay") // 设置父包名
                            .entity("model.entity")
//                            .moduleName("pay") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D:\\project\\personal\\cloud2024\\pay\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_pay") // 设置需要生成的表名.
                            .addTablePrefix() // 设置过滤表前缀
                            .mapperBuilder().enableBaseColumnList().enableBaseResultMap().build()
                            .entityBuilder().enableFileOverride().build();

                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
