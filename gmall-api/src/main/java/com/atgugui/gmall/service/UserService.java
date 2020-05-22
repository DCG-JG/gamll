package com.atgugui.gmall.service;

import com.atgugui.gmall.bean.UmsMember;
import com.atgugui.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
    void InsertUser(UmsMember user);
    void DeletetUser(UmsMember user);
    void UpdateUser(UmsMember user);
}
