package me.erobaby.study.netty.firstnetty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class LoginResponsePacket implements Packet {
    private String userId;
    private Boolean success;
    private String message;

    @Override
    @JsonIgnore
    public byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
