package com.rent.bean;

import lombok.Data;

import java.util.Date;

@Data
public class showHousedl {
    String title;//: "整租.上海",
    Integer rent;//: 3000,
    String hsType;//: "整套",
    Integer hsArea;//: 666,

    String  hsOriented;//: "朝南",
    Integer hsLayer;//: "2/3层",
    String hsAddress;//: "上海西路1122号",
    Date rtlfReleasetime;//: "2019/10/30"
}
