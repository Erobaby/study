package me.erobaby.study.netty.firstnetty;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonSerializer implements Serializer {

    private static ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte getSerializerAlgorithm() {
        return JSON_SERIAL;
    }

    @Override
    public byte[] serial(Object obj) {
        try {
            return objectMapper.writeValueAsBytes(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T> T deserial(byte[] data, Class<T> clazz) {
        try {
            return objectMapper.readValue(data, clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
