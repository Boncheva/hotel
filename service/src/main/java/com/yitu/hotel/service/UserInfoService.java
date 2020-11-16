package com.yitu.hotel.service;

import com.github.pagehelper.PageInfo;
import com.yitu.hotel.model.JsonResult;
import com.yitu.hotel.model.entity.DgtxPlaces;
import com.yitu.hotel.model.entity.User;

import java.util.List;

public interface UserInfoService {

    PageInfo<User> getUserInfoList(User user);

    List<DgtxPlaces> getAreaList(DgtxPlaces dgtxPlaces);

    User getUserInfo(String userId);

    JsonResult restPwd(User user);

    JsonResult deleteUser(String userId);
}
