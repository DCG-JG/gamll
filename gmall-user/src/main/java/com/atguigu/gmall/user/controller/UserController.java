package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }



    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
    //增加
    @RequestMapping("insertUser")
    @ResponseBody
    public String  insertUser(){
        UmsMember user =new UmsMember();
        userService.InsertUser(user);
        return "成功";
    }
    //删除
    @RequestMapping("deletetUser")
    @ResponseBody
    public String  deletetUser(){
        UmsMember user =new UmsMember();
        user.setId("11");
        userService.DeletetUser(user);
        return "成功";
    }
    //修改
    @RequestMapping("updateUser")
    @ResponseBody
    public String  updateUser(){
        UmsMember user =new UmsMember();
        user.setId("12");
        user.setUsername("哦豁");
        user.setJob("没工作");
        userService.UpdateUser(user);
        return "成功";
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }



}
