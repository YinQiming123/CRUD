package com.tomorrow;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author YinQiming
 * @create 2022-06-12 0:16
 */
public class MyAutoGenerator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(
                new GlobalConfig()
                    .setOutputDir(System.getProperty("user.dir") + "/src/main/java")
                    .setOpen(false)
                    .setAuthor("yinqiming")
                    .setServiceName("%sService")
                    .setDateType(DateType.ONLY_DATE)
                    .setIdType(IdType.AUTO))
                .setDataSource(
                        new DataSourceConfig()
                        .setDbType(DbType.MYSQL)
                        .setUrl("jdbc:mysql://localhost:3306/crud?userSSL=false&characterEncoding=utf-8")
                        .setDriverName("com.mysql.cj.jdbc.Driver")
                        .setUsername("root")
                        .setPassword("1234"))
                .setPackageInfo(
                        new PackageConfig()
                            .setParent("com.tomorrow")
                            .setEntity("pojo"))
                .setStrategy(
                        new StrategyConfig()
                        .setEntityLombokModel(true)
                        .setRestControllerStyle(true)
                        .setLogicDeleteFieldName("is_deleted")
                        .setNaming(NamingStrategy.underline_to_camel)
                        .setColumnNaming(NamingStrategy.underline_to_camel)
                        .setInclude("user","class","address"))
                .execute();
    }
}
