package me.freeking.study.spring;

import lombok.Data;

@Data
public class Account {
    private Friend friend;
    private String name;
}
