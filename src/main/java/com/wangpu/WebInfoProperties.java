package com.wangpu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Kenvin on 2018/1/5.
 */
@Component
@ConfigurationProperties(prefix = "webInfo")
public class WebInfoProperties {
    private  String author;
    private  String createTime;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
