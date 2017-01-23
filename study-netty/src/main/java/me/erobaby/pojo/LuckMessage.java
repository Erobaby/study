package me.erobaby.pojo;

/**
 * Created by erobaby on 2017/1/23.
 */
public class LuckMessage {
    // 消息头
    private LuckHeader header;
    // 消息体
    private String content;

    public LuckHeader getHeader() {
        return header;
    }

    public void setHeader(LuckHeader header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return String.format("[version=%d,contentLength=%d,sessionId=%s,content=%s]",
                header.getVersion(),
                header.getContentLength(),
                header.getSessionId(),
                content);
    }
}
