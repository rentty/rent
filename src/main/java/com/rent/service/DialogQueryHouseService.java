package com.rent.service;

import java.util.List;

public interface DialogQueryHouseService {
    /**
     * 获取所有栏目，（条目+条件条目）
     * @return json数据-----List
     */
    public String getAllDialogAndEntrydl();

    /**
     *按照栏目查询符合所有条件的房屋
     * @param dl_Entry 条目
     * @param edl_detail 条目条件
     * @return 所有房屋信息JSon----List
     */
    public String getAllHouseByDialog(String dl_Entry,String edl_detail);


}
