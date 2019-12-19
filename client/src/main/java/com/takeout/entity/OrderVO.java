package com.takeout.entity;

import lombok.Data;
import org.springframework.core.annotation.Order;

import java.util.List;

@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
