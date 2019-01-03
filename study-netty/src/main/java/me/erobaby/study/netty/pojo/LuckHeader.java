package me.erobaby.study.netty.pojo;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckHeader {
    // 协议版本
    private int version;
    // 消息长度
    private int contentLength;
    // 服务名称
    private String sessionId;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
