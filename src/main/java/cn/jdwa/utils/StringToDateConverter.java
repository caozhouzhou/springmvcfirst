package cn.jdwa.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by czz on 2019/9/5.
 */
public class StringToDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        if (s == null){
            throw new RuntimeException("参数异常");
        }
        DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
        try {
            return df.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("数据类型转换错误");
        }
    }
}
