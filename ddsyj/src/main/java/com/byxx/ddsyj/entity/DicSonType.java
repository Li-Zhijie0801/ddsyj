package com.byxx.ddsyj.entity;


import lombok.Data;

@Data
public class DicSonType {
    private String id;
    private String name;//应急分类
    private String parentClass;//上级分类
    private String imgUrl;

}
