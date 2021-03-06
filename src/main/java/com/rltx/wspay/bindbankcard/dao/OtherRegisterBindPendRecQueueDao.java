package com.rltx.wspay.bindbankcard.dao;

import com.rltx.wspay.bindbankcard.entity.OtherRegisterBindPendRecQueueEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by  zl on 2020/6/10 14:14.
 * Description:
 * 他人信息开户绑卡记录
 *
 */
@Mapper
public interface OtherRegisterBindPendRecQueueDao {

    void insert(OtherRegisterBindPendRecQueueEntity entity);

    List<OtherRegisterBindPendRecQueueEntity> selectList(@Param("params") Map<String, String> params);

    OtherRegisterBindPendRecQueueEntity select(@Param("params") Map<String, String> paramMap);

    OtherRegisterBindPendRecQueueEntity selectByFourElements(@Param("params") Map<String, String> paramMap);
}
