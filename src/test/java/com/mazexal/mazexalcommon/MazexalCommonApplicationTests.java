package com.mazexal.mazexalcommon;

import com.mazexal.mazexalcommon.dao.UserMapper;
import com.mazexal.mazexalcommon.model.domain.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MazexalCommonApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        UserModel userModel = new UserModel();
        userModel.setUserName("ha");
        userMapper.insert(userModel);
    }

}
