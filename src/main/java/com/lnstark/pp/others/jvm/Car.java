package main.java.com.lnstark.pp.others.jvm;

import lombok.Builder;
import lombok.Data;

/**
 * by Lnstark
 * 2021/6/12
 */
@Data
@Builder
public class Car {
    private int id;
    private String type;
    private double price;
    private char level;
}
