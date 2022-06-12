package com.tomorrow;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * @author YinQiming
 * @create 2022-06-12 0:16
 */
public class MyAutoGenerator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        ArrayList<TableFill> tableFills = new ArrayList<>();
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        TableFill status = new TableFill("status", FieldFill.INSERT);
        TableFill isDeleted = new TableFill("is_deleted", FieldFill.INSERT);
        tableFills.add(createTime);
        tableFills.add(updateTime);
        tableFills.add(status);
        tableFills.add(isDeleted);
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
                        .setInclude("user","class","address")
                        .setTableFillList(tableFills))
                .execute();
    }
}
