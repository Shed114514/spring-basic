package com.shed.service.impl;

import com.shed.dao.MemberDao;
import com.shed.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("memberService")
@Service("memberService")
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao;

    /*@Autowired
    @Qualifier("userDao")*/
    @Resource(name="memberDao")
    public void setUserDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void print() {
        System.out.println("[MemberService]print方法被调用...");
        memberDao.print();
    }
}
