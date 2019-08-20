package me.erobaby.study.netty.firstnetty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class LoginRequestPacket implements Packet {
    private String userId;
    private String username;
    private String pasword;

    @Override
    @JsonIgnore
    public byte getCommand() {
        return LOGIN_REQUEST;
    }
}
