package me.erobaby.study.netty.firstnetty;

public interface Serializer {
    Serializer DEFAULT = new JsonSerializer();
    byte getSerializerAlgorithm();
    byte[] serial(Object obj);
    <T> T deserial(byte[] data, Class<T> clazz);

    byte JSON_SERIAL = 1;
}
