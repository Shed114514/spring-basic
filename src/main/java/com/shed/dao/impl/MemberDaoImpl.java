package com.shed.dao.impl;

import com.shed.dao.MemberDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

//@Component("memberDao")
@Scope("singleton")
@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {
    @Override
    public void print() {
        System.out.println("[MemberDao]print方法被调用...");
    }
}
