package me.erobaby.study.netty.firstnetty;

public interface Packet {
    byte version = 1;
    byte getCommand();

    byte LOGIN_REQUEST = 10;
    byte LOGIN_RESPONSE = 11;
}
