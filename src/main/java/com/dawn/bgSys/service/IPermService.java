package com.dawn.bgSys.service;

import com.alibaba.fastjson.JSONObject;
import com.dawn.bgSys.domain.*;

import java.util.List;

/**
 * Created by zhouchaoyi on 2016/4/5.
 */
public interface IPermService {
    public Module addModule(Module module);

    public Module updateModule(Module module);

    public JSONObject listModule(int currentPage,int pageSize,String orderBy,String searchStr);

    public int deleteModule(String moduleId);

    public Module queryModuleById(String id);

    public int moveModule(String moduleId,String move);
}